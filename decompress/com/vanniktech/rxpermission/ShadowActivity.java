// 
// Decompiled by Procyon v0.6.0
// 

package com.vanniktech.rxpermission;

import android.content.Context;
import android.os.BaseBundle;
import io.reactivex.subjects.PublishSubject;
import android.app.Application;
import zd2.c;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public final class ShadowActivity extends Activity
{
    public static final int g = 0;
    public boolean[] f;
    
    public final void finish() {
        super.finish();
        this.overridePendingTransition(0, 0);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final String[] stringArrayExtra = this.getIntent().getStringArrayExtra("permissions");
            final boolean[] f = new boolean[stringArrayExtra.length];
            for (int i = 0; i < stringArrayExtra.length; ++i) {
                f[i] = this.shouldShowRequestPermissionRationale(stringArrayExtra[i]);
            }
            this.f = f;
            this.requestPermissions(stringArrayExtra, 42);
        }
        else {
            this.f = ((BaseBundle)bundle).getBooleanArray("save-rationale");
        }
    }
    
    public final void onNewIntent(final Intent intent) {
        final String[] stringArrayExtra = intent.getStringArrayExtra("permissions");
        final boolean[] f = new boolean[stringArrayExtra.length];
        for (int i = 0; i < stringArrayExtra.length; ++i) {
            f[i] = this.shouldShowRequestPermissionRationale(stringArrayExtra[i]);
        }
        this.f = f;
        this.requestPermissions(stringArrayExtra, 42);
    }
    
    public final void onRequestPermissionsResult(int i, final String[] array, final int[] array2) {
        if (i == 42) {
            final boolean[] array3 = new boolean[array.length];
            for (i = 0; i < array.length; ++i) {
                array3[i] = this.shouldShowRequestPermissionRationale(array[i]);
            }
            final Application application = this.getApplication();
            final Object c = zd2.c.c;
            synchronized (c.class) {
                if (zd2.c.d == null) {
                    zd2.c.d = new c((Application)((Context)application).getApplicationContext());
                }
                monitorexit(c.class);
                final c d = zd2.c.d;
                final boolean[] f = this.f;
                d.getClass();
                int length;
                PublishSubject publishSubject;
                for (length = array.length, i = 0; i < length; ++i) {
                    publishSubject = d.b.get(array[i]);
                    if (publishSubject == null) {
                        throw new IllegalStateException("RealRxPermission.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                    }
                    d.b.remove(array[i]);
                    if (array2[i] == 0) {
                        publishSubject.onNext((Object)new a(array[i], Permission.State.GRANTED));
                    }
                    else if (!f[i] && !array3[i]) {
                        publishSubject.onNext((Object)new a(array[i], Permission.State.DENIED_NOT_SHOWN));
                    }
                    else {
                        publishSubject.onNext((Object)new a(array[i], Permission.State.DENIED));
                    }
                    publishSubject.onComplete();
                }
                this.finish();
            }
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        ((BaseBundle)bundle).putBooleanArray("save-rationale", this.f);
        super.onSaveInstanceState(bundle);
    }
}
