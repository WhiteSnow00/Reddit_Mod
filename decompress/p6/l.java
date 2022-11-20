// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import d60.d0;
import com.reddit.domain.model.UserSubreddit;
import java.util.Iterator;
import c60.u0;
import android.content.SharedPreferences$Editor;
import io.reactivex.subjects.PublishSubject;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import com.reddit.data.events.datasource.local.DatabaseEventDataSource;
import com.reddit.data.events.models.Event;
import com.reddit.domain.model.MyAccount;
import com.reddit.data.local.DatabaseAccountDataSource;
import cg2.j;
import d60.s;
import x40.q;
import com.reddit.domain.model.Subreddit;
import d60.u;
import java.util.ArrayList;
import dg2.m;
import java.util.Collection;
import com.reddit.data.local.RedditLocalSubredditDataSource;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import com.reddit.data.local.d;
import com.reddit.data.postsubmit.VideoUploadService;
import java.util.concurrent.Semaphore;
import java.io.Closeable;
import zd.b;
import java.io.OutputStream;
import java.io.FileOutputStream;
import android.content.Context;
import ng2.e;
import android.net.Uri;
import ut1.a;
import com.reddit.video.creation.video.VideoRenderApiImpl;
import com.reddit.video.creation.widgets.utils.image.BitmapUtils;
import java.io.File;
import java.util.concurrent.Callable;

public final class l implements Callable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public l(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        final int f = this.f;
        boolean booleanValue = false;
        switch (f) {
            default: {
                return BitmapUtils.c((File)this.g, (File)this.h);
            }
            case 9: {
                return VideoRenderApiImpl.a((File)this.g, (VideoRenderApiImpl)this.h);
            }
            case 8: {
                final a a = (a)this.g;
                final Uri uri = (Uri)this.h;
                e.f((Object)a, "this$0");
                e.f((Object)uri, "$contentUri");
                final File file = new File(((Context)a.a.invoke()).getFilesDir(), "uploads");
                if (!file.exists()) {
                    file.mkdirs();
                }
                final File file2 = new File(file, "image.jpg");
                final FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    final InputStream openInputStream = ((Context)a.a.invoke()).getContentResolver().openInputStream(uri);
                    if (openInputStream != null) {
                        try {
                            xd.a.M(openInputStream, (OutputStream)fileOutputStream, 8192);
                            b.u(openInputStream, null);
                        }
                        finally {
                            try {}
                            finally {
                                b.u(openInputStream, (Throwable)file2);
                            }
                        }
                    }
                    b.u(fileOutputStream, null);
                    return file2;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        b.u(fileOutputStream, t);
                    }
                }
            }
            case 7: {
                final g70.a a2 = (g70.a)this.g;
                final jf0.e e = (jf0.e)this.h;
                ng2.e.f((Object)a2, "this$0");
                ng2.e.f((Object)e, "$key");
                final Object value = a2.f.get(e);
                ng2.e.c(value);
                if (((Semaphore)value).tryAcquire()) {
                    return e;
                }
                throw new Throwable();
            }
            case 6: {
                final VideoUploadService videoUploadService = (VideoUploadService)this.g;
                final String s = (String)this.h;
                final PublishSubject h = VideoUploadService.H;
                videoUploadService.getClass();
                return VideoUploadService.h(s);
            }
            case 5: {
                final d d = (d)this.g;
                final List list = (List)this.h;
                final String d2 = com.reddit.data.local.d.d;
                e.f((Object)d, "this$0");
                e.f((Object)list, "$regions");
                final SharedPreferences$Editor edit = d.b.edit();
                final String d3 = com.reddit.data.local.d.d;
                final Object value2 = d.c.getValue();
                e.e(value2, "<get-adapter>(...)");
                edit.putString(d3, ((JsonAdapter)value2).toJson((Object)list)).apply();
                d.b.edit().putLong(com.reddit.data.local.d.e, System.currentTimeMillis()).apply();
                return Boolean.TRUE;
            }
            case 4: {
                final RedditLocalSubredditDataSource redditLocalSubredditDataSource = (RedditLocalSubredditDataSource)this.g;
                final Collection collection = (Collection)this.h;
                e.f((Object)redditLocalSubredditDataSource, "this$0");
                e.f((Object)collection, "$subreddits");
                final u0 d4 = redditLocalSubredditDataSource.d;
                final ArrayList list2 = new ArrayList<u>(m.u4((Iterable)collection, 10));
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    list2.add(RedditLocalSubredditDataSource.R(redditLocalSubredditDataSource, (Subreddit)iterator.next(), false, 3));
                }
                d4.S0(list2);
                return Boolean.TRUE;
            }
            case 3: {
                final q q = (q)this.g;
                final s s2 = (s)this.h;
                e.f((Object)q, "this$0");
                e.f((Object)s2, "$linkStateDataModel");
                q.a.h1(s2);
                return j.a;
            }
            case 2: {
                final DatabaseAccountDataSource databaseAccountDataSource = (DatabaseAccountDataSource)this.g;
                final MyAccount myAccount = (MyAccount)this.h;
                e.f((Object)databaseAccountDataSource, "this$0");
                e.f((Object)myAccount, "$account");
                final c60.a i = databaseAccountDataSource.i();
                final String id = myAccount.getId();
                final String username = myAccount.getUsername();
                final long createdUtc = myAccount.getCreatedUtc();
                final boolean employee = myAccount.isEmployee();
                final Boolean friend = myAccount.isFriend();
                final boolean b = friend != null && friend;
                final boolean suspended = myAccount.isSuspended();
                final Integer suspensionExpirationUtc = myAccount.getSuspensionExpirationUtc();
                final boolean hideFromRobots = myAccount.getHideFromRobots();
                final int linkKarma = myAccount.getLinkKarma();
                final int totalKarma = myAccount.getTotalKarma();
                final int commentKarma = myAccount.getCommentKarma();
                final int awarderKarma = myAccount.getAwarderKarma();
                final int awardeeKarma = myAccount.getAwardeeKarma();
                final boolean hasPremium = myAccount.getHasPremium();
                final boolean premiumSubscriber = myAccount.isPremiumSubscriber();
                final Long premiumExpirationUtcSeconds = myAccount.getPremiumExpirationUtcSeconds();
                final Long premiumSinceUtcSeconds = myAccount.getPremiumSinceUtcSeconds();
                final boolean mod = myAccount.isMod();
                final Boolean hasVerifiedEmail = myAccount.getHasVerifiedEmail();
                final String email = myAccount.getEmail();
                final Integer inboxCount = myAccount.getInboxCount();
                int intValue;
                if (inboxCount != null) {
                    intValue = inboxCount;
                }
                else {
                    intValue = 0;
                }
                final Boolean hasMail = myAccount.getHasMail();
                final boolean b2 = hasMail != null && hasMail;
                final Boolean hasModMail = myAccount.getHasModMail();
                if (hasModMail != null) {
                    booleanValue = hasModMail;
                }
                final boolean hideAds = myAccount.getHideAds();
                final int coins = myAccount.getCoins();
                final String iconUrl = myAccount.getIconUrl();
                final Boolean showMyActiveCommunities = myAccount.getShowMyActiveCommunities();
                final boolean outboundClickTracking = myAccount.getOutboundClickTracking();
                final boolean forcePasswordReset = myAccount.getForcePasswordReset();
                final String json = databaseAccountDataSource.j().toJson((Object)myAccount.getFeatures());
                final boolean canCreateSubreddit = myAccount.getCanCreateSubreddit();
                final boolean canEditName = myAccount.getCanEditName();
                final List linkedIdentities = myAccount.getLinkedIdentities();
                final boolean hasPasswordSet = myAccount.getHasPasswordSet();
                final Boolean acceptChats = myAccount.getAcceptChats();
                final Boolean acceptPrivateMessages = myAccount.getAcceptPrivateMessages();
                final String snoovatarUrl = myAccount.getSnoovatarUrl();
                final boolean hasSubscribedToPremium = myAccount.getHasSubscribedToPremium();
                final String phoneCountryCode = myAccount.getPhoneCountryCode();
                final String phoneMaskedNumber = myAccount.getPhoneMaskedNumber();
                e.e((Object)json, "toJson(features)");
                final d60.a a3 = new d60.a(id, username, createdUtc, employee, b, suspended, suspensionExpirationUtc, hideFromRobots, linkKarma, commentKarma, awarderKarma, awardeeKarma, totalKarma, hasPremium, premiumSubscriber, premiumExpirationUtcSeconds, premiumSinceUtcSeconds, mod, hasVerifiedEmail, email, intValue, b2, booleanValue, hideAds, coins, iconUrl, showMyActiveCommunities, outboundClickTracking, forcePasswordReset, json, canCreateSubreddit, canEditName, linkedIdentities, hasPasswordSet, acceptChats, acceptPrivateMessages, snoovatarUrl, false, hasSubscribedToPremium, phoneCountryCode, phoneMaskedNumber, 64);
                final UserSubreddit subreddit = myAccount.getSubreddit();
                d0 m;
                if (subreddit != null) {
                    m = DatabaseAccountDataSource.m(subreddit, myAccount.getUsername());
                }
                else {
                    m = null;
                }
                i.z0(a3, (List)null, m, (List)null);
                return Boolean.TRUE;
            }
            case 1: {
                final Event event = (Event)this.g;
                final DatabaseEventDataSource databaseEventDataSource = (DatabaseEventDataSource)this.h;
                e.f((Object)event, "$event");
                e.f((Object)databaseEventDataSource, "this$0");
                final Long client_timestamp = event.client_timestamp;
                e.e((Object)client_timestamp, "event.client_timestamp");
                final long longValue = client_timestamp.longValue();
                final String json2 = databaseEventDataSource.i().toJson((Object)event);
                e.e((Object)json2, "adapter.toJson(event)");
                final byte[] bytes = json2.getBytes(xi2.a.b);
                e.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
                return new ch0.a(0L, longValue, bytes, false);
            }
            case 0: {
                return r.h((ZipInputStream)this.g, (String)this.h);
            }
        }
    }
}
