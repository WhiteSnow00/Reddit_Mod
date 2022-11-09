// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import android.os.Handler;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import gn.a;
import android.os.Build$VERSION;
import androidx.lifecycle.y;

public final class h implements y<d>
{
    public final /* synthetic */ e a;
    
    public h(final e a) {
        this.a = a;
    }
    
    public final void a(Object o) {
        final d d = (d)o;
        if (d != null) {
            final e a = this.a;
            final int a2 = d.a;
            CharSequence charSequence = d.b;
            final int n = 0;
            boolean b = false;
            switch (a2) {
                default: {
                    b = false;
                    break;
                }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15: {
                    b = true;
                    break;
                }
            }
            int n2;
            if (b) {
                n2 = a2;
            }
            else {
                n2 = 8;
            }
            final Context context = a.getContext();
            final int sdk_INT = Build$VERSION.SDK_INT;
            Label_0463: {
                if (sdk_INT < 29 && (n2 == 7 || n2 == 9) && context != null) {
                    final KeyguardManager a3 = androidx.biometric.y.a(context);
                    if (a3 != null && androidx.biometric.y.b(a3) && c.a(a.g.c())) {
                        a.r0();
                        break Label_0463;
                    }
                }
                if (a.q0()) {
                    if (charSequence == null) {
                        charSequence = gn.a.X0(n2, a.getContext());
                    }
                    if (n2 == 5) {
                        final int l = a.g.l;
                        if (l == 0 || l == 3) {
                            a.t0(n2, charSequence);
                        }
                        a.dismiss();
                    }
                    else {
                        if (a.g.w) {
                            a.s0(n2, charSequence);
                        }
                        else {
                            a.y0(charSequence);
                            final Handler f = a.f;
                            o = new n(a, n2, charSequence);
                            final Context context2 = a.getContext();
                            int n3 = 0;
                            Label_0390: {
                                if (context2 != null) {
                                    final String model = Build.MODEL;
                                    if (sdk_INT == 28 && u.b(context2, 2130903070, model)) {
                                        n3 = n;
                                        break Label_0390;
                                    }
                                }
                                n3 = 2000;
                            }
                            f.postDelayed((Runnable)o, (long)n3);
                        }
                        a.g.w = true;
                    }
                }
                else {
                    if (charSequence == null) {
                        o = new StringBuilder();
                        ((StringBuilder)o).append(a.getString(2131953048));
                        ((StringBuilder)o).append(" ");
                        ((StringBuilder)o).append(n2);
                        charSequence = ((StringBuilder)o).toString();
                    }
                    a.s0(n2, charSequence);
                }
            }
            this.a.g.e(null);
        }
    }
}
