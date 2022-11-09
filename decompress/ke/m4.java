// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.util.Log;
import android.os.Binder;
import j5.f;
import android.database.ContentObserver;
import android.content.Context;

public final class m4
{
    public static m4 c;
    public final Context a;
    public final l4 b;
    
    public m4() {
        this.a = null;
        this.b = null;
    }
    
    public m4(final Context a) {
        this.a = a;
        final l4 b = new l4();
        this.b = b;
        a.getContentResolver().registerContentObserver(e4.a, true, (ContentObserver)b);
    }
    
    public final String a(final String s) {
        if (this.a == null) {
            return null;
        }
        try {
            final f f = new f(3, (Object)this, (Object)s);
            try {
                final Object o = f.zza();
            }
            catch (final SecurityException ex) {
                final long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    final Object o = f.zza();
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return (String)o;
                }
                finally {
                    try {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                    catch (final NullPointerException ex) {}
                    catch (final SecurityException ex) {}
                    catch (final IllegalStateException ex2) {}
                }
            }
        }
        catch (final NullPointerException ex3) {}
        catch (final SecurityException ex4) {}
        catch (final IllegalStateException ex5) {}
        final SecurityException ex;
        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(s)), (Throwable)ex);
        return null;
    }
}
