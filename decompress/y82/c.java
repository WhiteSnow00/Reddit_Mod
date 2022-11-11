// 
// Decompiled by Procyon v0.6.0
// 

package y82;

import com.reddit.vault.model.VaultInfoResponse;
import com.reddit.vault.data.local.LocalCommunitiesDataSource$allCommunities$$inlined$map$2;
import x82.i;
import x82.k;

public interface c
{
    Object a(final String p0, final lg2.c<? super k> p1);
    
    Object b(final String p0, final lg2.c<? super i> p1);
    
    LocalCommunitiesDataSource$allCommunities$$inlined$map$2 c();
    
    Object d(final lg2.c<? super Boolean> p0);
    
    boolean e();
    
    Object getCommunityVaultInfo(final String p0, final lg2.c<? super VaultInfoResponse> p1);
}
