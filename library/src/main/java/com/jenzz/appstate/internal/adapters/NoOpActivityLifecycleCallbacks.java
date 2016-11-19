package com.jenzz.appstate.internal.adapters;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.annotation.RestrictTo;

import static android.support.annotation.RestrictTo.Scope.GROUP_ID;

@RestrictTo(GROUP_ID)
public class NoOpActivityLifecycleCallbacks implements ActivityLifecycleCallbacks {

  //@formatter:off
  @Override public void onActivityCreated(Activity activity, Bundle savedInstanceState) {}
  @Override public void onActivityStarted(Activity activity) {}
  @Override public void onActivityResumed(Activity activity) {}
  @Override public void onActivityPaused(Activity activity) {}
  @Override public void onActivityStopped(Activity activity) {}
  @Override public void onActivitySaveInstanceState(Activity activity, Bundle outState) {}
  @Override public void onActivityDestroyed(Activity activity) {}
  //@formatter:on
}