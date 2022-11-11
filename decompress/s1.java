// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.BaseBundle;
import android.os.Bundle;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import pg.a;
import ng.f;
import ig.k0;
import ng.a0;
import aj2.c;
import ig.l0;
import ig.m0;

public final class s1 implements m0
{
    public final /* synthetic */ int f;
    public final m0 g;
    public final m0 h;
    public final m0 i;
    
    public final Object zza() {
        Label_0128: {
            switch (this.f) {
                default: {
                    break Label_0128;
                }
                case 0: {
                    final Context a = ((t1)this.g).a();
                    final k0 a2 = l0.a(this.h);
                    final k0 a3 = l0.a(this.i);
                    Object string = null;
                    while (true) {
                        try {
                            final Bundle metaData = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128).metaData;
                            if (metaData != null) {
                                string = ((BaseBundle)metaData).getString("local_testing_dir");
                            }
                            if (string == null) {
                                string = a2.zza();
                            }
                            else {
                                string = a3.zza();
                            }
                            c.e1(string);
                            return string;
                            return new a0((k0<f>)l0.a(this.g), (k0<a>)l0.a(this.h), (k0<File>)l0.a(this.i));
                        }
                        catch (final PackageManager$NameNotFoundException ex) {
                            continue;
                        }
                        break;
                    }
                    break;
                }
            }
        }
    }
}
