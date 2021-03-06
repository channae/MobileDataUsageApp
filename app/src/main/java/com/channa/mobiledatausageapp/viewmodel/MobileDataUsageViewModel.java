package com.channa.mobiledatausageapp.viewmodel;

import com.channa.mobiledatausageapp.data.model.YearListWrapper;
import com.channa.mobiledatausageapp.repository.MobileDataRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class MobileDataUsageViewModel extends ViewModel {

    MobileDataRepository mobileDataRepository;

    public MobileDataUsageViewModel(MobileDataRepository mobileDataRepository) {
        this.mobileDataRepository = mobileDataRepository;
    }

    public LiveData<YearListWrapper> getYearlyMobileDataUsage() {
        return mobileDataRepository.getYearlyMobileDataUsage();
    }
}
