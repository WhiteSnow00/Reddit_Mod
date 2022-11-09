// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.n;
import av2.a;
import com.reddit.domain.model.AccountPreferencesPatch;
import tg2.c;
import av2.f;
import com.reddit.domain.model.AccountPreferences;
import nf2.c0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0013\u0010\u0005\u001a\u00020\u0003H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u001d\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H§@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "Lcom/reddit/data/remote/RemoteAccountPreferenceDataSource;", "", "Lnf2/c0;", "Lcom/reddit/domain/model/AccountPreferences;", "getPreferences", "getPreferencesSuspend", "(Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/model/AccountPreferencesPatch;", "body", "patchPreferences", "patchPreferencesSuspend", "(Lcom/reddit/domain/model/AccountPreferencesPatch;Ltg2/c;)Ljava/lang/Object;", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteAccountPreferenceDataSource
{
    @f("/api/v1/me/prefs")
    c0<AccountPreferences> getPreferences();
    
    @f("/api/v1/me/prefs")
    Object getPreferencesSuspend(final c<? super AccountPreferences> p0);
    
    @n("/api/v1/me/prefs")
    c0<AccountPreferences> patchPreferences(@a final AccountPreferencesPatch p0);
    
    @n("/api/v1/me/prefs")
    Object patchPreferencesSuspend(@a final AccountPreferencesPatch p0, final c<? super AccountPreferences> p1);
}
