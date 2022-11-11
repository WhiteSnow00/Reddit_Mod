// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import com.google.android.gms.internal.firebase_auth_api.zzty;
import android.text.TextUtils;

public final class dc
{
    public static Object a(final String s, final Class clazz) throws com.google.android.gms.internal.firebase-auth-api.zzty {
        if (clazz == String.class) {
            try {
                final uc uc = new uc();
                uc.b(s);
                if (TextUtils.isEmpty((CharSequence)uc.f) ^ true) {
                    return uc.f;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("No error message: ");
                sb.append(s);
                throw new zzty(sb.toString());
            }
            catch (final Exception ex) {
                throw new zzty("Json conversion failed! ".concat(String.valueOf(ex.getMessage())), (Throwable)ex);
            }
        }
        if (clazz != Void.class) {
            try {
                final fc fc = clazz.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                try {
                    fc.a(s);
                    return fc;
                }
                catch (final Exception ex2) {
                    throw new zzty("Json conversion failed! ".concat(String.valueOf(ex2.getMessage())), (Throwable)ex2);
                }
            }
            catch (final Exception ex3) {
                throw new zzty("Instantiation of JsonResponse failed! ".concat(clazz.toString()), (Throwable)ex3);
            }
        }
        return null;
    }
}
