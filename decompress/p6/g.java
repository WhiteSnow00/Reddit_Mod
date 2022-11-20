// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import android.view.View;
import java.util.HashMap;
import android.content.ComponentName;
import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import d60.d0;
import com.reddit.domain.model.UserSubreddit;
import java.util.Iterator;
import com.airbnb.lottie.LottieAnimationView;
import android.util.Log;
import oi.u;
import android.content.Intent;
import android.content.Context;
import com.reddit.domain.model.CommentKt;
import com.reddit.domain.model.CommentResponse;
import com.reddit.comment.data.repository.RedditCommentRepository;
import com.reddit.domain.model.CommunityHub;
import d60.b0;
import com.reddit.domain.model.sociallink.SocialLink;
import d60.c0;
import java.util.ArrayList;
import dg2.m;
import java.util.List;
import kotlin.collections.EmptyList;
import com.reddit.domain.model.Account;
import com.reddit.data.local.DatabaseAccountDataSource;
import com.reddit.domain.model.Subreddit;
import com.reddit.data.local.RedditLocalSubredditDataSource;
import cg2.j;
import java.util.concurrent.Semaphore;
import jf0.e;
import g70.a;
import java.util.concurrent.Callable;

public final class g implements Callable
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public g(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                final a a = (a)this.g;
                final e e = (e)this.h;
                ng2.e.f((Object)a, "this$0");
                ng2.e.f((Object)e, "$key");
                final Semaphore semaphore = a.f.get(e);
                j a2;
                if (semaphore != null) {
                    semaphore.release();
                    a2 = j.a;
                }
                else {
                    a2 = null;
                }
                return a2;
            }
            case 4: {
                final RedditLocalSubredditDataSource redditLocalSubredditDataSource = (RedditLocalSubredditDataSource)this.g;
                final Subreddit subreddit = (Subreddit)this.h;
                ng2.e.f((Object)redditLocalSubredditDataSource, "this$0");
                ng2.e.f((Object)subreddit, "$subreddit");
                redditLocalSubredditDataSource.d.w1(RedditLocalSubredditDataSource.R(redditLocalSubredditDataSource, subreddit, false, 3));
                return Boolean.TRUE;
            }
            case 3: {
                final DatabaseAccountDataSource databaseAccountDataSource = (DatabaseAccountDataSource)this.g;
                final Account account = (Account)this.h;
                ng2.e.f((Object)databaseAccountDataSource, "this$0");
                ng2.e.f((Object)account, "$account");
                final c60.a i = databaseAccountDataSource.i();
                final String id = account.getId();
                final String username = account.getUsername();
                final long createdUtc = account.getCreatedUtc();
                final boolean employee = account.isEmployee();
                final boolean friend = account.isFriend();
                final boolean suspended = account.isSuspended();
                final Integer suspensionExpirationUtc = account.getSuspensionExpirationUtc();
                final boolean hideFromRobots = account.getHideFromRobots();
                final int totalKarma = account.getTotalKarma();
                final int linkKarma = account.getLinkKarma();
                final int commentKarma = account.getCommentKarma();
                final int awarderKarma = account.getAwarderKarma();
                final int awardeeKarma = account.getAwardeeKarma();
                final boolean hasPremium = account.getHasPremium();
                final boolean premiumSubscriber = account.isPremiumSubscriber();
                final Long premiumExpirationUtcSeconds = account.getPremiumExpirationUtcSeconds();
                final Long premiumSinceUtcSeconds = account.getPremiumSinceUtcSeconds();
                final boolean mod = account.isMod();
                final Boolean hasVerifiedEmail = account.getHasVerifiedEmail();
                final String email = account.getEmail();
                final int inboxCount = account.getInboxCount();
                final boolean hasMail = account.getHasMail();
                final boolean hasModMail = account.getHasModMail();
                final boolean hideAds = account.getHideAds();
                final int coins = account.getCoins();
                final String iconUrl = account.getIconUrl();
                final Boolean showMyActiveCommunities = account.getShowMyActiveCommunities();
                final boolean outboundClickTracking = account.getOutboundClickTracking();
                final boolean forcePasswordReset = account.getForcePasswordReset();
                final String json = databaseAccountDataSource.j().toJson((Object)account.getFeatures());
                final boolean canCreateSubreddit = account.getCanCreateSubreddit();
                final boolean canEditName = account.getCanEditName();
                Object o;
                if ((o = account.getLinkedIdentities()) == null) {
                    o = EmptyList.INSTANCE;
                }
                final boolean hasPasswordSet = account.getHasPasswordSet();
                final Boolean acceptChats = account.getAcceptChats();
                final Boolean acceptPrivateMessages = account.getAcceptPrivateMessages();
                final String snoovatarImg = account.getSnoovatarImg();
                final boolean hasSubscribedToPremium = account.getHasSubscribedToPremium();
                final boolean acceptFollowers = account.getAcceptFollowers();
                ng2.e.e((Object)json, "toJson(features)");
                final d60.a a3 = new d60.a(id, username, createdUtc, employee, friend, suspended, suspensionExpirationUtc, hideFromRobots, linkKarma, commentKarma, awarderKarma, awardeeKarma, totalKarma, hasPremium, premiumSubscriber, premiumExpirationUtcSeconds, premiumSinceUtcSeconds, mod, hasVerifiedEmail, email, inboxCount, hasMail, hasModMail, hideAds, coins, iconUrl, showMyActiveCommunities, outboundClickTracking, forcePasswordReset, json, canCreateSubreddit, canEditName, (List)o, hasPasswordSet, acceptChats, acceptPrivateMessages, snoovatarImg, acceptFollowers, hasSubscribedToPremium, (String)null, (String)null, 768);
                final List socialLinks = account.getSocialLinks();
                final ArrayList list = new ArrayList<c0>(m.u4((Iterable)socialLinks, 10));
                for (final SocialLink socialLink : socialLinks) {
                    list.add(new c0(socialLink.getId(), socialLink.getPosition(), account.getUsername(), socialLink.getUrl(), socialLink.getTitle(), socialLink.getHandle(), socialLink.getType().getString()));
                }
                final UserSubreddit subreddit2 = account.getSubreddit();
                d0 m;
                if (subreddit2 != null) {
                    m = DatabaseAccountDataSource.m(subreddit2, account.getUsername());
                }
                else {
                    m = null;
                }
                final List communityHubs = account.getCommunityHubs();
                final ArrayList list2 = new ArrayList<b0>(dg2.m.u4((Iterable)communityHubs, 10));
                for (final CommunityHub communityHub : communityHubs) {
                    list2.add(new b0(communityHub.getId(), communityHub.getName(), account.getUsername()));
                }
                i.z0(a3, (List)list, m, (List)list2);
                return Boolean.TRUE;
            }
            case 2: {
                final RedditCommentRepository redditCommentRepository = (RedditCommentRepository)this.g;
                final CommentResponse commentResponse = (CommentResponse)this.h;
                ng2.e.f((Object)redditCommentRepository, "this$0");
                ng2.e.f((Object)commentResponse, "$response");
                redditCommentRepository.d.b(CommentKt.toAbbreviatedComments(commentResponse.getComments()));
                return j.a;
            }
            case 1: {
                final Context context = (Context)this.g;
                final Intent intent = (Intent)this.h;
                final Object c = oi.g.c;
                final u a4 = u.a();
                a4.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                a4.d.offer(intent);
                final Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a4) {
                    String s = a4.a;
                    Label_1170: {
                        if (s != null) {
                            monitorexit(a4);
                        }
                        else {
                            final ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            Label_1167: {
                                if (resolveService != null) {
                                    final ServiceInfo serviceInfo = resolveService.serviceInfo;
                                    if (serviceInfo != null) {
                                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                                            final String name = serviceInfo.name;
                                            if (name != null) {
                                                if (name.startsWith(".")) {
                                                    final StringBuilder sb = new StringBuilder();
                                                    sb.append(context.getPackageName());
                                                    sb.append(serviceInfo.name);
                                                    a4.a = sb.toString();
                                                }
                                                else {
                                                    a4.a = serviceInfo.name;
                                                }
                                                s = a4.a;
                                                monitorexit(a4);
                                                break Label_1170;
                                            }
                                        }
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                                        sb2.append(serviceInfo.packageName);
                                        sb2.append("/");
                                        sb2.append(serviceInfo.name);
                                        Log.e("FirebaseMessaging", sb2.toString());
                                        monitorexit(a4);
                                        break Label_1167;
                                    }
                                }
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                                monitorexit(a4);
                            }
                            s = null;
                        }
                    }
                    if (s != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Restricting intent to a specific service: ");
                            sb3.append(s);
                            Log.d("FirebaseMessaging", sb3.toString());
                        }
                        intent2.setClassName(context.getPackageName(), s);
                    }
                    int n;
                    try {
                        ComponentName componentName;
                        if (a4.c(context)) {
                            componentName = oi.c0.b(context, intent2);
                        }
                        else {
                            componentName = context.startService(intent2);
                            Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                        }
                        if (componentName == null) {
                            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                            n = 404;
                        }
                        else {
                            n = -1;
                        }
                    }
                    catch (final IllegalStateException ex) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Failed to start service while in background: ");
                        sb4.append(ex);
                        Log.e("FirebaseMessaging", sb4.toString());
                        n = 402;
                    }
                    catch (final SecurityException ex2) {
                        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", (Throwable)ex2);
                        n = 401;
                    }
                    return n;
                }
            }
            case 0: {
                final LottieAnimationView lottieAnimationView = (LottieAnimationView)this.g;
                final String s2 = (String)this.h;
                i0<h> i2;
                if (lottieAnimationView.s) {
                    final Context context2 = ((View)lottieAnimationView).getContext();
                    final HashMap a5 = r.a;
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("asset_");
                    sb5.append(s2);
                    i2 = r.c(context2, s2, sb5.toString());
                }
                else {
                    i2 = r.c(((View)lottieAnimationView).getContext(), s2, null);
                }
                return i2;
            }
        }
    }
}
