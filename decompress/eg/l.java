// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.RemoteException;
import android.os.Bundle;
import qg.k;
import com.google.android.play.core.assetpacks.a;
import android.os.ParcelFileDescriptor;

public final class l extends j<ParcelFileDescriptor>
{
    public l(final a a, final k<ParcelFileDescriptor> k) {
        super(k);
    }
    
    @Override
    public final void S(final Bundle bundle, final Bundle bundle2) throws RemoteException {
        super.S(bundle, bundle2);
        super.a.b((Object)bundle.getParcelable("chunk_file_descriptor"));
    }
}
