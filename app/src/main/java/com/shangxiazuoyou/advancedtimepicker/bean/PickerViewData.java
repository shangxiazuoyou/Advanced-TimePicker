package com.shangxiazuoyou.advancedtimepicker.bean;

import shangxiazuoyou.advancedtimepicker.library.model.IPickerViewData;

public class PickerViewData implements IPickerViewData {
    private String content;

    public PickerViewData(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getPickerViewText() {
        return content;
    }
}
