package com.example.myapplication.slice;

import com.example.myapplication.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.element.FrameAnimationElement;

public class MainAbilitySlice extends AbilitySlice {
    Image Loader;
    FrameAnimationElement frameAnimationElement;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        Loader = (Image) findComponentById(ResourceTable.Id_loader);

        frameAnimationElement = new FrameAnimationElement(getContext(), ResourceTable.Graphic_loader);

        Loader.setBackground(frameAnimationElement);
        ShowLoader();
    }
    public void ShowLoader(){
        Loader.setVisibility(Component.VISIBLE);
        frameAnimationElement.start();
    }
    public void HideLoader(){
        frameAnimationElement.stop();
        Loader.setVisibility(Component.INVISIBLE);
    }
    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
