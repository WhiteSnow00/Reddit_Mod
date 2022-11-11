// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.datasource.remote;

import com.reddit.data.snoovatar.entity.SnoovatarJson;
import ru2.s;
import com.reddit.data.snoovatar.entity.ShareableSnoovatarJson;
import com.reddit.data.snoovatar.entity.RandomSnoovatarJson;
import com.reddit.data.snoovatar.entity.CategoryJson;
import java.util.List;
import com.reddit.data.snoovatar.entity.CatalogJson;
import ru2.t;
import com.reddit.data.snoovatar.entity.CSRFJson;
import ru2.f;
import com.reddit.data.snoovatar.entity.AccountJson;
import com.reddit.data.snoovatar.entity.ImageSnoovatarJson;
import com.reddit.data.snoovatar.entity.SaveSnoovatarBodyJson;
import ru2.o;
import hg2.j;
import nu2.w;
import lg2.c;
import ru2.a;
import com.reddit.data.snoovatar.entity.ModifyClosetBodyJson;
import ru2.i;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H作\u00f8\u0001\u0000兝u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H作\u00f8\u0001\u0000兝u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH作\u00f8\u0001\u0000兝u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0007H作\u00f8\u0001\u0000兝u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u0007H作\u00f8\u0001\u0000兝u0006\u0004\b\u0013\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u0014H作\u00f8\u0001\u0000兝u0006\u0004\b\u0015\u0010\u000eJ\u0013\u0010\u0017\u001a\u00020\u0016H作\u00f8\u0001\u0000兝u0006\u0004\b\u0017\u0010\u000eJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0019H作\u00f8\u0001\u0000兝u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0019H作\u00f8\u0001\u0000兝u0006\u0004\b \u0010\u001eJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u0019H作\u00f8\u0001\u0000兝u0006\u0004\b\"\u0010\u001eJ\u0013\u0010#\u001a\u00020\u001cH作\u00f8\u0001\u0000兝u0006\u0004\b#\u0010\u000eJ\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001bH作\u00f8\u0001\u0000兝u0006\u0004\b%\u0010\u000eJ-\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020&H作\u00f8\u0001\u0000兝u0006\u0004\b'\u0010(J-\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020&H作\u00f8\u0001\u0000兝u0006\u0004\b)\u0010(\u0082\u0002\u0004\n\u0002\b\u0019沔u0006*" }, d2 = { "Lcom/reddit/data/snoovatar/datasource/remote/RemoteSnoovatarDataSource;", "", "", "outfits", "Lcom/reddit/data/snoovatar/entity/CatalogJson;", "getCatalog", "(ZLlg2/c;)Ljava/lang/Object;", "", "audienceId", "getCatalogForAudience", "(Ljava/lang/String;Llg2/c;)Ljava/lang/Object;", "", "Lcom/reddit/data/snoovatar/entity/CategoryJson;", "getCategories", "(Llg2/c;)Ljava/lang/Object;", "accountId", "Lcom/reddit/data/snoovatar/entity/SnoovatarJson;", "getSnoovatar", "snoovatarId", "getSnoovatarById", "Lcom/reddit/data/snoovatar/entity/AccountJson;", "getAccountInfo", "Lcom/reddit/data/snoovatar/entity/CSRFJson;", "getCSRF", "csrfToken", "Lcom/reddit/data/snoovatar/entity/SaveSnoovatarBodyJson;", "body", "Lnu2/w;", "Lhg2/j;", "saveSnoovatar", "(Ljava/lang/String;Lcom/reddit/data/snoovatar/entity/SaveSnoovatarBodyJson;Llg2/c;)Ljava/lang/Object;", "Lcom/reddit/data/snoovatar/entity/ShareableSnoovatarJson;", "getShareableLink", "Lcom/reddit/data/snoovatar/entity/ImageSnoovatarJson;", "downloadSnoovatar", "getRandomSnoovatarLegacy", "Lcom/reddit/data/snoovatar/entity/RandomSnoovatarJson;", "getRandomSnoovatar", "Lcom/reddit/data/snoovatar/entity/ModifyClosetBodyJson;", "addToCloset", "(Ljava/lang/String;Lcom/reddit/data/snoovatar/entity/ModifyClosetBodyJson;Llg2/c;)Ljava/lang/Object;", "removeFromCloset", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteSnoovatarDataSource
{
    @o("/api/closet:addItems")
    Object addToCloset(@i("x-csrf-token") final String p0, @a final ModifyClosetBodyJson p1, final c<? super w<j>> p2);
    
    @o("/api/snoovatars/inpayload/download")
    Object downloadSnoovatar(@i("x-csrf-token") final String p0, @a final SaveSnoovatarBodyJson p1, final c<? super w<ImageSnoovatarJson>> p2);
    
    @f("/api/account")
    Object getAccountInfo(final c<? super AccountJson> p0);
    
    @f("/api/account/csrf")
    Object getCSRF(final c<? super CSRFJson> p0);
    
    @f("api/catalog")
    Object getCatalog(@t("outfits") final boolean p0, final c<? super CatalogJson> p1);
    
    @f("api/catalog")
    Object getCatalogForAudience(@t("audience") final String p0, final c<? super CatalogJson> p1);
    
    @f("api/categories")
    Object getCategories(final c<? super List<CategoryJson>> p0);
    
    @f("/api/snoovatars/random")
    Object getRandomSnoovatar(final c<? super w<RandomSnoovatarJson>> p0);
    
    @f("/api/snoovatar:getRandom")
    Object getRandomSnoovatarLegacy(final c<? super j> p0);
    
    @o("/api/snoovatar")
    Object getShareableLink(@i("x-csrf-token") final String p0, @a final SaveSnoovatarBodyJson p1, final c<? super w<ShareableSnoovatarJson>> p2);
    
    @f("/api/accounts/{account_id}/snoovatars/active")
    Object getSnoovatar(@s("account_id") final String p0, final c<? super SnoovatarJson> p1);
    
    @f("/api/snoovatars/{avatar_id}:byId")
    Object getSnoovatarById(@s("avatar_id") final String p0, final c<? super SnoovatarJson> p1);
    
    @o("/api/closet:removeItems")
    Object removeFromCloset(@i("x-csrf-token") final String p0, @a final ModifyClosetBodyJson p1, final c<? super w<j>> p2);
    
    @o("/api/snoovatar")
    Object saveSnoovatar(@i("x-csrf-token") final String p0, @a final SaveSnoovatarBodyJson p1, final c<? super w<j>> p2);
}
