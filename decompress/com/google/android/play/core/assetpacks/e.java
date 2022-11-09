// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import qg.n;
import java.util.concurrent.ExecutionException;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import eg.u1;
import ig.k0;

public final class e
{
    public final k0<u1> a;
    
    public e(final k0<u1> a) {
        this.a = a;
    }
    
    public final ParcelFileDescriptor$AutoCloseInputStream a(final int n, final int n2, final String s, final String s2) {
        final n f = ((u1)this.a.zza()).f(n, n2, s, s2);
        try {
            final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)qg.e.a(f);
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor$AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new zzck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", n, s, s2, n2), n);
        }
        catch (final InterruptedException ex) {
            throw new zzck("Extractor was interrupted while waiting for chunk file.", ex, n);
        }
        catch (final ExecutionException ex2) {
            throw new zzck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", n, s, s2, n2), ex2, n);
        }
    }
}
