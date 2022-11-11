// 
// Decompiled by Procyon v0.6.0
// 

package v92;

import u92.j;
import java.util.List;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import com.reddit.vault.feature.settings.adapter.data.section.VaultSection;

public final class a implements b
{
    public final VaultSection a;
    
    @Inject
    public a(final VaultSection a) {
        e.f((Object)a, "vaultSection");
        this.a = a;
    }
    
    public final Object a(final c<? super List<? extends j>> c) {
        return this.a.a(c);
    }
}
