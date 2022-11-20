// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;

public final class e
{
    public static g a(final LMSigParameters lmSigParameters, final LMOtsParameters lmOtsParameters, final int n, final byte[] array, final byte[] array2) throws IllegalArgumentException {
        if (array2 != null && array2.length >= lmSigParameters.b) {
            return new g(lmSigParameters, lmOtsParameters, n, array, 1 << lmSigParameters.c, array2);
        }
        final StringBuilder t = a.t("root seed is less than ");
        t.append(lmSigParameters.b);
        throw new IllegalArgumentException(t.toString());
    }
}
