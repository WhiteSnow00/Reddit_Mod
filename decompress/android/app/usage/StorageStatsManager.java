// 
// Decompiled by Procyon v0.6.0
// 

package android.app.usage;

import android.content.pm.PackageManager$NameNotFoundException;
import java.io.IOException;
import android.os.UserHandle;
import android.annotation.NonNull;
import java.util.UUID;

public class StorageStatsManager
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public native StorageStats queryStatsForPackage(@NonNull final UUID p0, @NonNull final String p1, @NonNull final UserHandle p2) throws IOException, PackageManager$NameNotFoundException;
}
