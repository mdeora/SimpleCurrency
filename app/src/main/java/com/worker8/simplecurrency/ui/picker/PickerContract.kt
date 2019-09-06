package com.worker8.simplecurrency.ui.picker

import io.reactivex.Observable


class PickerContract {
    interface Input {
        val isBase: Boolean
    }

    data class ScreenState(
        val currencyList: List<PickerAdapter.PickerRowType>
    )
}