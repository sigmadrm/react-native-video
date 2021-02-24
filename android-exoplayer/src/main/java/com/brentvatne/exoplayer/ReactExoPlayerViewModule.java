package com.brentvatne.exoplayer;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.sigma.drm.SigmaHelper;

public class ReactExoPlayerViewModule extends ReactContextBaseJavaModule {
  private static final String REACT_CLASS = "RCTVideo";

  public ReactExoPlayerViewModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @NonNull
  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @ReactMethod
  public void setMerchantId(final String merchantId) {
    SigmaHelper.instance().setMerchantId(merchantId);
  }

  @ReactMethod
  public void setAppId(final String appId) {
    SigmaHelper.instance().setAppId(appId);
  }

//  @ReactMethod
//  public void setUserId(final String userId) {
//    ReactExoplayerView.setUserId(userId);
//  }
//
//  @ReactMethod
//  public void setSessionId(final String sessionId) {
//    ReactExoplayerView.setSessionId(sessionId);
//  }
}
