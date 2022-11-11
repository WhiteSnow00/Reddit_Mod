// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import dl2.b;
import hm2.k;
import java.util.List;
import j32.d;
import p0.z;
import com.google.android.play.core.assetpacks.j;
import hm2.c;
import ok2.m;
import java.util.ArrayList;
import cg.q0;

public final class e implements q0
{
    public final /* synthetic */ int f;
    public int g = g;
    public Object h = h;
    
    public e() {
        this.f = 3;
        this.h = new ArrayList();
    }
    
    public e(final int g, int i) {
        this.f = i;
        if (i != 1) {
            this.g = g;
            final Float[] h = new Float[g];
            for (i = 0; i < g; ++i) {
                h[i] = 0.0f;
            }
            this.h = h;
            return;
        }
        if (g > 0) {
            this.h = new Object[g];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
    
    public e(final int g, final m m) {
        this.f = 5;
        if (m != null) {
            this.h = c.a(m);
            this.g = g;
            return;
        }
        throw new NullPointerException("digest == null");
    }
    
    public e(String s, final int n) {
        this.f = 4;
        this.h = "";
        this.g = -113;
        final StringBuilder r = a.r(s);
        if (n == -113) {
            this.g = -113;
            s = " Branch API Error: poor network connectivity. Please try again later.";
        }
        else if (n == -114) {
            this.g = -114;
            s = " Branch API Error: Please enter your branch_key in your project's manifest file first.";
        }
        else if (n == -104) {
            this.g = -104;
            s = " Did you forget to call init? Make sure you init the session before making Branch calls.";
        }
        else if (n == -101) {
            this.g = -101;
            s = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
        }
        else if (n == -102) {
            this.g = -102;
            s = " Please add 'android.permission.INTERNET' in your applications manifest file.";
        }
        else if (n == -105) {
            this.g = -105;
            s = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
        }
        else if (n == -108) {
            this.g = -108;
            s = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance(Context) instead.";
        }
        else if (n == -109) {
            this.g = -109;
            s = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
        }
        else if (n == -110) {
            this.g = -110;
            s = " Unable create share options. Couldn't find applications on device to share the link.";
        }
        else if (n == -111) {
            this.g = -111;
            s = " Request to Branch server timed out. Please check your internet connectivity";
        }
        else if (n == -117) {
            this.g = -117;
            s = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
        }
        else if (n == -118) {
            this.g = -118;
            s = " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
        }
        else if (n < 500 && n != -112) {
            if (n != 409 && n != -115) {
                if (n < 400 && n != -116) {
                    if (n == -119) {
                        this.g = -119;
                        s = "Intra-app linking (i.e. session reinitialization) requires an intent flag, \"branch_force_new_session\".";
                    }
                    else if (n == -120) {
                        this.g = -120;
                        s = " Task exceeded timeout.";
                    }
                    else {
                        this.g = -113;
                        s = " Check network connectivity and that you properly initialized.";
                    }
                }
                else {
                    this.g = -116;
                    s = " The request was invalid.";
                }
            }
            else {
                this.g = -115;
                s = " A resource with this identifier already exists.";
            }
        }
        else {
            this.g = -112;
            s = " Unable to reach the Branch servers, please try again shortly.";
        }
        r.append(s);
        this.h = r.toString();
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) {
        if (array.length != this.g) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (array2.length == 32) {
            return this.c(array, 3, array2);
        }
        throw new IllegalArgumentException("wrong address length");
    }
    
    public final void b(final int n, final int n2, final z z, final float n3, final j32.c c) {
        if (n == 0) {
            return;
        }
        final int g = this.g;
        final d d = new d(g, n2, z, n3, c);
        this.g = g + n;
        ((List)this.h).add(d);
    }
    
    public final byte[] c(byte[] array, int g, final byte[] array2) {
        final byte[] i = k.i(this.g, (long)g);
        ((b)this.h).b(0, i.length, i);
        ((b)this.h).b(0, array.length, array);
        ((b)this.h).b(0, array2.length, array2);
        g = this.g;
        array = new byte[g];
        final Object h = this.h;
        final boolean b = ((b)h) instanceof dl2.d;
        final b b2 = (b)h;
        if (b) {
            ((dl2.d)b2).d(0, g, array);
        }
        else {
            b2.g(0, array);
        }
        return array;
    }
    
    public final d d(final int n) {
        if (n >= 0 && n < this.g) {
            final Object h = this.h;
            final List list = (List)h;
            final List list2 = (List)h;
            int l0 = lw0.b.L0(list2);
            int n2 = 0;
            int n3;
            while ((n3 = n2) < l0) {
                n3 = (n2 + l0) / 2;
                final int a = list2.get(n3).a;
                if (a != n) {
                    if (a >= n) {
                        l0 = n3 - 1;
                        continue;
                    }
                    if (n >= ((d)list2.get(n2 = n3 + 1)).a) {
                        continue;
                    }
                }
                break;
            }
            return (d)list.get(n3);
        }
        final StringBuilder i = al0.b.i("Index ", n, ", size ");
        i.append(this.g);
        throw new IndexOutOfBoundsException(i.toString());
    }
    
    public final void e(final Object o) {
        final int g = this.g;
        final Object[] array = (Object[])this.h;
        if (g < array.length) {
            array[g] = o;
            this.g = g + 1;
        }
    }
    
    public final float f(final e e) {
        e.f((Object)e, "a");
        final int g = this.g;
        float n = 0.0f;
        for (int i = 0; i < g; ++i) {
            n += ((Float[])e.h)[i] * ((Float[])this.h)[i];
        }
        return n;
    }
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 4: {
                return (String)this.h;
            }
        }
    }
    
    public final Object zza() {
        ((j)this.h).b(this.g).c.d = 5;
        return null;
    }
}
