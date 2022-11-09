// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import java.util.concurrent.Executor;
import j5.r;
import io.reactivex.plugins.RxJavaPlugins;
import nf2.j;
import io.reactivex.BackpressureStrategy;
import j5.q;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import j5.u;
import nf2.g;
import ah2.f;
import java.util.concurrent.Callable;
import j5.o;
import nf2.n;
import j5.w;
import j5.d;
import i60.b0;
import i60.c0;
import com.reddit.common.size.MediaSize;
import com.reddit.common.subreddit.SubredditPostType;
import java.util.List;
import i60.d0;
import j5.e;
import androidx.room.RoomDatabase;

public final class b implements a
{
    public final RoomDatabase f;
    public final b$l g;
    public final b$m h;
    public final b$n i;
    public final b$o j;
    public final b$q k;
    public final b$r l;
    public final b$a m;
    public final b$b n;
    public final b$c o;
    public final b$d p;
    
    public b(final RoomDatabase f) {
        this.f = f;
        new e<i60.a>(f) {
            public final String b() {
                return "INSERT OR ABORT INTO `account` (`accountId`,`name`,`createdUtc`,`isEmployee`,`isFriend`,`isSuspended`,`suspensionExpiration`,`hideFromRobots`,`linkKarma`,`commentKarma`,`awarderKarma`,`awardeeKarma`,`totalKarma`,`isGold`,`isPremiumSubscriber`,`premiumExpirationUtc`,`premiumSinceUtc`,`isMod`,`hasVerifiedEmail`,`email`,`inboxCount`,`hasMail`,`hasModMail`,`hideAds`,`coins`,`iconUrl`,`showMyActiveCommunities`,`outboundClickTracking`,`forcePasswordReset`,`inChat`,`featuresJson`,`canCreateSubreddit`,`canEditName`,`linkedIdentities`,`hasPasswordSet`,`acceptChats`,`acceptPrivateMessages`,`snoovatarUrl`,`acceptFollowers`,`hasSubscribedToPremium`,`phoneCountryCode`,`phoneMaskedNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final i60.a a = (i60.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a2);
                }
                final String b = a.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, a.c);
                e.bindLong(4, a.d ? 1 : 0);
                e.bindLong(5, a.e ? 1 : 0);
                e.bindLong(6, a.f ? 1 : 0);
                final Integer g = a.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, g);
                }
                e.bindLong(8, a.h ? 1 : 0);
                e.bindLong(9, a.i);
                e.bindLong(10, a.j);
                e.bindLong(11, a.k);
                e.bindLong(12, a.l);
                e.bindLong(13, a.m);
                e.bindLong(14, a.n ? 1 : 0);
                e.bindLong(15, a.o ? 1 : 0);
                final Long p2 = a.p;
                if (p2 == null) {
                    e.bindNull(16);
                }
                else {
                    e.bindLong(16, p2);
                }
                final Long q = a.q;
                if (q == null) {
                    e.bindNull(17);
                }
                else {
                    e.bindLong(17, q);
                }
                e.bindLong(18, a.r ? 1 : 0);
                final Boolean s = a.s;
                final Integer n = null;
                Integer value;
                if (s == null) {
                    value = null;
                }
                else {
                    value = (((boolean)s) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(19);
                }
                else {
                    e.bindLong(19, value);
                }
                final String t = a.t;
                if (t == null) {
                    e.bindNull(20);
                }
                else {
                    e.bindString(20, t);
                }
                e.bindLong(21, a.u);
                e.bindLong(22, a.v ? 1 : 0);
                e.bindLong(23, a.w ? 1 : 0);
                e.bindLong(24, a.x ? 1 : 0);
                e.bindLong(25, a.y);
                final String z = a.z;
                if (z == null) {
                    e.bindNull(26);
                }
                else {
                    e.bindString(26, z);
                }
                final Boolean a3 = a.A;
                Integer value2;
                if (a3 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)a3) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(27);
                }
                else {
                    e.bindLong(27, value2);
                }
                e.bindLong(28, a.B ? 1 : 0);
                e.bindLong(29, a.C ? 1 : 0);
                e.bindLong(30, a.D ? 1 : 0);
                final String e2 = a.E;
                if (e2 == null) {
                    e.bindNull(31);
                }
                else {
                    e.bindString(31, e2);
                }
                e.bindLong(32, a.F ? 1 : 0);
                e.bindLong(33, a.G ? 1 : 0);
                e.bindString(34, com.reddit.db.converters.a.g(a.H));
                e.bindLong(35, a.I ? 1 : 0);
                final Boolean j = a.J;
                Integer value3;
                if (j == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)j) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(36);
                }
                else {
                    e.bindLong(36, value3);
                }
                final Boolean k = a.K;
                Integer value4;
                if (k == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)k) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(37);
                }
                else {
                    e.bindLong(37, value4);
                }
                final String l = a.L;
                if (l == null) {
                    e.bindNull(38);
                }
                else {
                    e.bindString(38, l);
                }
                e.bindLong(39, a.M ? 1 : 0);
                e.bindLong(40, a.N ? 1 : 0);
                final String o2 = a.O;
                if (o2 == null) {
                    e.bindNull(41);
                }
                else {
                    e.bindString(41, o2);
                }
                final String p3 = a.P;
                if (p3 == null) {
                    e.bindNull(42);
                }
                else {
                    e.bindString(42, p3);
                }
            }
        };
        new e<i60.a>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `account` (`accountId`,`name`,`createdUtc`,`isEmployee`,`isFriend`,`isSuspended`,`suspensionExpiration`,`hideFromRobots`,`linkKarma`,`commentKarma`,`awarderKarma`,`awardeeKarma`,`totalKarma`,`isGold`,`isPremiumSubscriber`,`premiumExpirationUtc`,`premiumSinceUtc`,`isMod`,`hasVerifiedEmail`,`email`,`inboxCount`,`hasMail`,`hasModMail`,`hideAds`,`coins`,`iconUrl`,`showMyActiveCommunities`,`outboundClickTracking`,`forcePasswordReset`,`inChat`,`featuresJson`,`canCreateSubreddit`,`canEditName`,`linkedIdentities`,`hasPasswordSet`,`acceptChats`,`acceptPrivateMessages`,`snoovatarUrl`,`acceptFollowers`,`hasSubscribedToPremium`,`phoneCountryCode`,`phoneMaskedNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final i60.a a = (i60.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a2);
                }
                final String b = a.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, a.c);
                e.bindLong(4, a.d ? 1 : 0);
                e.bindLong(5, a.e ? 1 : 0);
                e.bindLong(6, a.f ? 1 : 0);
                final Integer g = a.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, g);
                }
                e.bindLong(8, a.h ? 1 : 0);
                e.bindLong(9, a.i);
                e.bindLong(10, a.j);
                e.bindLong(11, a.k);
                e.bindLong(12, a.l);
                e.bindLong(13, a.m);
                e.bindLong(14, a.n ? 1 : 0);
                e.bindLong(15, a.o ? 1 : 0);
                final Long p2 = a.p;
                if (p2 == null) {
                    e.bindNull(16);
                }
                else {
                    e.bindLong(16, p2);
                }
                final Long q = a.q;
                if (q == null) {
                    e.bindNull(17);
                }
                else {
                    e.bindLong(17, q);
                }
                e.bindLong(18, a.r ? 1 : 0);
                final Boolean s = a.s;
                final Integer n = null;
                Integer value;
                if (s == null) {
                    value = null;
                }
                else {
                    value = (((boolean)s) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(19);
                }
                else {
                    e.bindLong(19, value);
                }
                final String t = a.t;
                if (t == null) {
                    e.bindNull(20);
                }
                else {
                    e.bindString(20, t);
                }
                e.bindLong(21, a.u);
                e.bindLong(22, a.v ? 1 : 0);
                e.bindLong(23, a.w ? 1 : 0);
                e.bindLong(24, a.x ? 1 : 0);
                e.bindLong(25, a.y);
                final String z = a.z;
                if (z == null) {
                    e.bindNull(26);
                }
                else {
                    e.bindString(26, z);
                }
                final Boolean a3 = a.A;
                Integer value2;
                if (a3 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)a3) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(27);
                }
                else {
                    e.bindLong(27, value2);
                }
                e.bindLong(28, a.B ? 1 : 0);
                e.bindLong(29, a.C ? 1 : 0);
                e.bindLong(30, a.D ? 1 : 0);
                final String e2 = a.E;
                if (e2 == null) {
                    e.bindNull(31);
                }
                else {
                    e.bindString(31, e2);
                }
                e.bindLong(32, a.F ? 1 : 0);
                e.bindLong(33, a.G ? 1 : 0);
                e.bindString(34, com.reddit.db.converters.a.g(a.H));
                e.bindLong(35, a.I ? 1 : 0);
                final Boolean j = a.J;
                Integer value3;
                if (j == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)j) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(36);
                }
                else {
                    e.bindLong(36, value3);
                }
                final Boolean k = a.K;
                Integer value4;
                if (k == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)k) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(37);
                }
                else {
                    e.bindLong(37, value4);
                }
                final String l = a.L;
                if (l == null) {
                    e.bindNull(38);
                }
                else {
                    e.bindString(38, l);
                }
                e.bindLong(39, a.M ? 1 : 0);
                e.bindLong(40, a.N ? 1 : 0);
                final String o2 = a.O;
                if (o2 == null) {
                    e.bindNull(41);
                }
                else {
                    e.bindString(41, o2);
                }
                final String p3 = a.P;
                if (p3 == null) {
                    e.bindNull(42);
                }
                else {
                    e.bindString(42, p3);
                }
            }
        };
        this.g = new e<i60.a>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `account` (`accountId`,`name`,`createdUtc`,`isEmployee`,`isFriend`,`isSuspended`,`suspensionExpiration`,`hideFromRobots`,`linkKarma`,`commentKarma`,`awarderKarma`,`awardeeKarma`,`totalKarma`,`isGold`,`isPremiumSubscriber`,`premiumExpirationUtc`,`premiumSinceUtc`,`isMod`,`hasVerifiedEmail`,`email`,`inboxCount`,`hasMail`,`hasModMail`,`hideAds`,`coins`,`iconUrl`,`showMyActiveCommunities`,`outboundClickTracking`,`forcePasswordReset`,`inChat`,`featuresJson`,`canCreateSubreddit`,`canEditName`,`linkedIdentities`,`hasPasswordSet`,`acceptChats`,`acceptPrivateMessages`,`snoovatarUrl`,`acceptFollowers`,`hasSubscribedToPremium`,`phoneCountryCode`,`phoneMaskedNumber`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final i60.a a = (i60.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a2);
                }
                final String b = a.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, a.c);
                e.bindLong(4, a.d ? 1 : 0);
                e.bindLong(5, a.e ? 1 : 0);
                e.bindLong(6, a.f ? 1 : 0);
                final Integer g = a.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, g);
                }
                e.bindLong(8, a.h ? 1 : 0);
                e.bindLong(9, a.i);
                e.bindLong(10, a.j);
                e.bindLong(11, a.k);
                e.bindLong(12, a.l);
                e.bindLong(13, a.m);
                e.bindLong(14, a.n ? 1 : 0);
                e.bindLong(15, a.o ? 1 : 0);
                final Long p2 = a.p;
                if (p2 == null) {
                    e.bindNull(16);
                }
                else {
                    e.bindLong(16, p2);
                }
                final Long q = a.q;
                if (q == null) {
                    e.bindNull(17);
                }
                else {
                    e.bindLong(17, q);
                }
                e.bindLong(18, a.r ? 1 : 0);
                final Boolean s = a.s;
                final Integer n = null;
                Integer value;
                if (s == null) {
                    value = null;
                }
                else {
                    value = (((boolean)s) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(19);
                }
                else {
                    e.bindLong(19, value);
                }
                final String t = a.t;
                if (t == null) {
                    e.bindNull(20);
                }
                else {
                    e.bindString(20, t);
                }
                e.bindLong(21, a.u);
                e.bindLong(22, a.v ? 1 : 0);
                e.bindLong(23, a.w ? 1 : 0);
                e.bindLong(24, a.x ? 1 : 0);
                e.bindLong(25, a.y);
                final String z = a.z;
                if (z == null) {
                    e.bindNull(26);
                }
                else {
                    e.bindString(26, z);
                }
                final Boolean a3 = a.A;
                Integer value2;
                if (a3 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)a3) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(27);
                }
                else {
                    e.bindLong(27, value2);
                }
                e.bindLong(28, a.B ? 1 : 0);
                e.bindLong(29, a.C ? 1 : 0);
                e.bindLong(30, a.D ? 1 : 0);
                final String e2 = a.E;
                if (e2 == null) {
                    e.bindNull(31);
                }
                else {
                    e.bindString(31, e2);
                }
                e.bindLong(32, a.F ? 1 : 0);
                e.bindLong(33, a.G ? 1 : 0);
                e.bindString(34, com.reddit.db.converters.a.g(a.H));
                e.bindLong(35, a.I ? 1 : 0);
                final Boolean j = a.J;
                Integer value3;
                if (j == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)j) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(36);
                }
                else {
                    e.bindLong(36, value3);
                }
                final Boolean k = a.K;
                Integer value4;
                if (k == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)k) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(37);
                }
                else {
                    e.bindLong(37, value4);
                }
                final String l = a.L;
                if (l == null) {
                    e.bindNull(38);
                }
                else {
                    e.bindString(38, l);
                }
                e.bindLong(39, a.M ? 1 : 0);
                e.bindLong(40, a.N ? 1 : 0);
                final String o2 = a.O;
                if (o2 == null) {
                    e.bindNull(41);
                }
                else {
                    e.bindString(41, o2);
                }
                final String p3 = a.P;
                if (p3 == null) {
                    e.bindNull(42);
                }
                else {
                    e.bindString(42, p3);
                }
            }
        };
        this.h = new e<d0>(f) {
            public final String b() {
                return "INSERT OR IGNORE INTO `user_subreddit` (`username`,`bannerImg`,`userIsBanned`,`description`,`userIsMuted`,`displayName`,`headerImg`,`title`,`userIsModerator`,`over18`,`iconImg`,`displayNamePrefixed`,`subscribers`,`isDefaultIcon`,`keyColor`,`kindWithId`,`isDefaultBanner`,`url`,`userIsContributor`,`publicDescription`,`subredditType`,`userIsSubscriber`,`showInDefaultSubreddits`,`allowedPostTypes`,`icon_size_width`,`icon_size_height`,`banner_size_width`,`banner_size_height`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final d0 d0 = (d0)o;
                final String a = d0.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final String b = d0.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                final Boolean c = d0.c;
                final Integer n = null;
                Integer value;
                if (c == null) {
                    value = null;
                }
                else {
                    value = (((boolean)c) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(3);
                }
                else {
                    e.bindLong(3, value);
                }
                final String d2 = d0.d;
                if (d2 == null) {
                    e.bindNull(4);
                }
                else {
                    e.bindString(4, d2);
                }
                final Boolean e2 = d0.e;
                Integer value2;
                if (e2 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)e2) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindLong(5, value2);
                }
                final String f = d0.f;
                if (f == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindString(6, f);
                }
                final String g = d0.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindString(7, g);
                }
                final String h = d0.h;
                if (h == null) {
                    e.bindNull(8);
                }
                else {
                    e.bindString(8, h);
                }
                final Boolean i = d0.i;
                Integer value3;
                if (i == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)i) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(9);
                }
                else {
                    e.bindLong(9, value3);
                }
                e.bindLong(10, d0.j ? 1 : 0);
                final String k = d0.k;
                if (k == null) {
                    e.bindNull(11);
                }
                else {
                    e.bindString(11, k);
                }
                final String l = d0.l;
                if (l == null) {
                    e.bindNull(12);
                }
                else {
                    e.bindString(12, l);
                }
                e.bindLong(13, d0.m);
                e.bindLong(14, d0.n ? 1 : 0);
                final String o2 = d0.o;
                if (o2 == null) {
                    e.bindNull(15);
                }
                else {
                    e.bindString(15, o2);
                }
                final String p2 = d0.p;
                if (p2 == null) {
                    e.bindNull(16);
                }
                else {
                    e.bindString(16, p2);
                }
                e.bindLong(17, d0.q ? 1 : 0);
                final String r = d0.r;
                if (r == null) {
                    e.bindNull(18);
                }
                else {
                    e.bindString(18, r);
                }
                final Boolean s = d0.s;
                Integer value4;
                if (s == null) {
                    value4 = null;
                }
                else {
                    value4 = (((boolean)s) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(19);
                }
                else {
                    e.bindLong(19, value4);
                }
                final String t = d0.t;
                if (t == null) {
                    e.bindNull(20);
                }
                else {
                    e.bindString(20, t);
                }
                final String u = d0.u;
                if (u == null) {
                    e.bindNull(21);
                }
                else {
                    e.bindString(21, u);
                }
                final Boolean v = d0.v;
                Integer value5;
                if (v == null) {
                    value5 = n;
                }
                else {
                    value5 = (((boolean)v) ? 1 : 0);
                }
                if (value5 == null) {
                    e.bindNull(22);
                }
                else {
                    e.bindLong(22, value5);
                }
                e.bindLong(23, d0.w ? 1 : 0);
                e.bindString(24, com.reddit.db.converters.a.e(d0.z));
                final MediaSize x = d0.x;
                if (x != null) {
                    final Integer f2 = x.f;
                    if (f2 == null) {
                        e.bindNull(25);
                    }
                    else {
                        e.bindLong(25, f2);
                    }
                    final Integer g2 = x.g;
                    if (g2 == null) {
                        e.bindNull(26);
                    }
                    else {
                        e.bindLong(26, g2);
                    }
                }
                else {
                    e.bindNull(25);
                    e.bindNull(26);
                }
                final MediaSize y = d0.y;
                if (y != null) {
                    final Integer f3 = y.f;
                    if (f3 == null) {
                        e.bindNull(27);
                    }
                    else {
                        e.bindLong(27, f3);
                    }
                    final Integer g3 = y.g;
                    if (g3 == null) {
                        e.bindNull(28);
                    }
                    else {
                        e.bindLong(28, g3);
                    }
                }
                else {
                    e.bindNull(27);
                    e.bindNull(28);
                }
            }
        };
        this.i = new e<c0>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `userSocialLink` (`id`,`username`,`url`,`position`,`title`,`handle`,`type`) VALUES (?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final c0 c0 = (c0)o;
                final String a = c0.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final String b = c0.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                final String c2 = c0.c;
                if (c2 == null) {
                    e.bindNull(3);
                }
                else {
                    e.bindString(3, c2);
                }
                e.bindLong(4, c0.d);
                final String e2 = c0.e;
                if (e2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindString(5, e2);
                }
                final String f = c0.f;
                if (f == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindString(6, f);
                }
                final String g = c0.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindString(7, g);
                }
            }
        };
        this.j = new e<b0>(f) {
            public final String b() {
                return "INSERT OR REPLACE INTO `userMyReddits` (`id`,`name`,`username`) VALUES (?,?,?)";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final b0 b0 = (b0)o;
                final String a = b0.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final String b2 = b0.b;
                if (b2 == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b2);
                }
                final String c = b0.c;
                if (c == null) {
                    e.bindNull(3);
                }
                else {
                    e.bindString(3, c);
                }
            }
        };
        new d<i60.a>(f) {
            public final String b() {
                return "DELETE FROM `account` WHERE `accountId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final String a = ((i60.a)o).a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
            }
        };
        this.k = new d<i60.a>(f) {
            public final String b() {
                return "UPDATE OR ABORT `account` SET `accountId` = ?,`name` = ?,`createdUtc` = ?,`isEmployee` = ?,`isFriend` = ?,`isSuspended` = ?,`suspensionExpiration` = ?,`hideFromRobots` = ?,`linkKarma` = ?,`commentKarma` = ?,`awarderKarma` = ?,`awardeeKarma` = ?,`totalKarma` = ?,`isGold` = ?,`isPremiumSubscriber` = ?,`premiumExpirationUtc` = ?,`premiumSinceUtc` = ?,`isMod` = ?,`hasVerifiedEmail` = ?,`email` = ?,`inboxCount` = ?,`hasMail` = ?,`hasModMail` = ?,`hideAds` = ?,`coins` = ?,`iconUrl` = ?,`showMyActiveCommunities` = ?,`outboundClickTracking` = ?,`forcePasswordReset` = ?,`inChat` = ?,`featuresJson` = ?,`canCreateSubreddit` = ?,`canEditName` = ?,`linkedIdentities` = ?,`hasPasswordSet` = ?,`acceptChats` = ?,`acceptPrivateMessages` = ?,`snoovatarUrl` = ?,`acceptFollowers` = ?,`hasSubscribedToPremium` = ?,`phoneCountryCode` = ?,`phoneMaskedNumber` = ? WHERE `accountId` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final i60.a a = (i60.a)o;
                final String a2 = a.a;
                if (a2 == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a2);
                }
                final String b = a.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                e.bindLong(3, a.c);
                e.bindLong(4, a.d ? 1 : 0);
                e.bindLong(5, a.e ? 1 : 0);
                e.bindLong(6, a.f ? 1 : 0);
                final Integer g = a.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindLong(7, g);
                }
                e.bindLong(8, a.h ? 1 : 0);
                e.bindLong(9, a.i);
                e.bindLong(10, a.j);
                e.bindLong(11, a.k);
                e.bindLong(12, a.l);
                e.bindLong(13, a.m);
                e.bindLong(14, a.n ? 1 : 0);
                e.bindLong(15, a.o ? 1 : 0);
                final Long p2 = a.p;
                if (p2 == null) {
                    e.bindNull(16);
                }
                else {
                    e.bindLong(16, p2);
                }
                final Long q = a.q;
                if (q == null) {
                    e.bindNull(17);
                }
                else {
                    e.bindLong(17, q);
                }
                e.bindLong(18, a.r ? 1 : 0);
                final Boolean s = a.s;
                final Integer n = null;
                Integer value;
                if (s == null) {
                    value = null;
                }
                else {
                    value = (((boolean)s) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(19);
                }
                else {
                    e.bindLong(19, value);
                }
                final String t = a.t;
                if (t == null) {
                    e.bindNull(20);
                }
                else {
                    e.bindString(20, t);
                }
                e.bindLong(21, a.u);
                e.bindLong(22, a.v ? 1 : 0);
                e.bindLong(23, a.w ? 1 : 0);
                e.bindLong(24, a.x ? 1 : 0);
                e.bindLong(25, a.y);
                final String z = a.z;
                if (z == null) {
                    e.bindNull(26);
                }
                else {
                    e.bindString(26, z);
                }
                final Boolean a3 = a.A;
                Integer value2;
                if (a3 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)a3) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(27);
                }
                else {
                    e.bindLong(27, value2);
                }
                e.bindLong(28, a.B ? 1 : 0);
                e.bindLong(29, a.C ? 1 : 0);
                e.bindLong(30, a.D ? 1 : 0);
                final String e2 = a.E;
                if (e2 == null) {
                    e.bindNull(31);
                }
                else {
                    e.bindString(31, e2);
                }
                e.bindLong(32, a.F ? 1 : 0);
                e.bindLong(33, a.G ? 1 : 0);
                e.bindString(34, com.reddit.db.converters.a.g(a.H));
                e.bindLong(35, a.I ? 1 : 0);
                final Boolean j = a.J;
                Integer value3;
                if (j == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)j) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(36);
                }
                else {
                    e.bindLong(36, value3);
                }
                final Boolean k = a.K;
                Integer value4;
                if (k == null) {
                    value4 = n;
                }
                else {
                    value4 = (((boolean)k) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(37);
                }
                else {
                    e.bindLong(37, value4);
                }
                final String l = a.L;
                if (l == null) {
                    e.bindNull(38);
                }
                else {
                    e.bindString(38, l);
                }
                e.bindLong(39, a.M ? 1 : 0);
                e.bindLong(40, a.N ? 1 : 0);
                final String o2 = a.O;
                if (o2 == null) {
                    e.bindNull(41);
                }
                else {
                    e.bindString(41, o2);
                }
                final String p3 = a.P;
                if (p3 == null) {
                    e.bindNull(42);
                }
                else {
                    e.bindString(42, p3);
                }
                final String a4 = a.a;
                if (a4 == null) {
                    e.bindNull(43);
                }
                else {
                    e.bindString(43, a4);
                }
            }
        };
        this.l = new d<d0>(f) {
            public final String b() {
                return "UPDATE OR ABORT `user_subreddit` SET `username` = ?,`bannerImg` = ?,`userIsBanned` = ?,`description` = ?,`userIsMuted` = ?,`displayName` = ?,`headerImg` = ?,`title` = ?,`userIsModerator` = ?,`over18` = ?,`iconImg` = ?,`displayNamePrefixed` = ?,`subscribers` = ?,`isDefaultIcon` = ?,`keyColor` = ?,`kindWithId` = ?,`isDefaultBanner` = ?,`url` = ?,`userIsContributor` = ?,`publicDescription` = ?,`subredditType` = ?,`userIsSubscriber` = ?,`showInDefaultSubreddits` = ?,`allowedPostTypes` = ?,`icon_size_width` = ?,`icon_size_height` = ?,`banner_size_width` = ?,`banner_size_height` = ? WHERE `username` = ?";
            }
            
            @Override
            public final void d(final n5.e e, final Object o) {
                final d0 d0 = (d0)o;
                final String a = d0.a;
                if (a == null) {
                    e.bindNull(1);
                }
                else {
                    e.bindString(1, a);
                }
                final String b = d0.b;
                if (b == null) {
                    e.bindNull(2);
                }
                else {
                    e.bindString(2, b);
                }
                final Boolean c = d0.c;
                final Integer n = null;
                Integer value;
                if (c == null) {
                    value = null;
                }
                else {
                    value = (((boolean)c) ? 1 : 0);
                }
                if (value == null) {
                    e.bindNull(3);
                }
                else {
                    e.bindLong(3, value);
                }
                final String d2 = d0.d;
                if (d2 == null) {
                    e.bindNull(4);
                }
                else {
                    e.bindString(4, d2);
                }
                final Boolean e2 = d0.e;
                Integer value2;
                if (e2 == null) {
                    value2 = null;
                }
                else {
                    value2 = (((boolean)e2) ? 1 : 0);
                }
                if (value2 == null) {
                    e.bindNull(5);
                }
                else {
                    e.bindLong(5, value2);
                }
                final String f = d0.f;
                if (f == null) {
                    e.bindNull(6);
                }
                else {
                    e.bindString(6, f);
                }
                final String g = d0.g;
                if (g == null) {
                    e.bindNull(7);
                }
                else {
                    e.bindString(7, g);
                }
                final String h = d0.h;
                if (h == null) {
                    e.bindNull(8);
                }
                else {
                    e.bindString(8, h);
                }
                final Boolean i = d0.i;
                Integer value3;
                if (i == null) {
                    value3 = null;
                }
                else {
                    value3 = (((boolean)i) ? 1 : 0);
                }
                if (value3 == null) {
                    e.bindNull(9);
                }
                else {
                    e.bindLong(9, value3);
                }
                e.bindLong(10, d0.j ? 1 : 0);
                final String k = d0.k;
                if (k == null) {
                    e.bindNull(11);
                }
                else {
                    e.bindString(11, k);
                }
                final String l = d0.l;
                if (l == null) {
                    e.bindNull(12);
                }
                else {
                    e.bindString(12, l);
                }
                e.bindLong(13, d0.m);
                e.bindLong(14, d0.n ? 1 : 0);
                final String o2 = d0.o;
                if (o2 == null) {
                    e.bindNull(15);
                }
                else {
                    e.bindString(15, o2);
                }
                final String p2 = d0.p;
                if (p2 == null) {
                    e.bindNull(16);
                }
                else {
                    e.bindString(16, p2);
                }
                e.bindLong(17, d0.q ? 1 : 0);
                final String r = d0.r;
                if (r == null) {
                    e.bindNull(18);
                }
                else {
                    e.bindString(18, r);
                }
                final Boolean s = d0.s;
                Integer value4;
                if (s == null) {
                    value4 = null;
                }
                else {
                    value4 = (((boolean)s) ? 1 : 0);
                }
                if (value4 == null) {
                    e.bindNull(19);
                }
                else {
                    e.bindLong(19, value4);
                }
                final String t = d0.t;
                if (t == null) {
                    e.bindNull(20);
                }
                else {
                    e.bindString(20, t);
                }
                final String u = d0.u;
                if (u == null) {
                    e.bindNull(21);
                }
                else {
                    e.bindString(21, u);
                }
                final Boolean v = d0.v;
                Integer value5;
                if (v == null) {
                    value5 = n;
                }
                else {
                    value5 = (((boolean)v) ? 1 : 0);
                }
                if (value5 == null) {
                    e.bindNull(22);
                }
                else {
                    e.bindLong(22, value5);
                }
                e.bindLong(23, d0.w ? 1 : 0);
                e.bindString(24, com.reddit.db.converters.a.e(d0.z));
                final MediaSize x = d0.x;
                if (x != null) {
                    final Integer f2 = x.f;
                    if (f2 == null) {
                        e.bindNull(25);
                    }
                    else {
                        e.bindLong(25, f2);
                    }
                    final Integer g2 = x.g;
                    if (g2 == null) {
                        e.bindNull(26);
                    }
                    else {
                        e.bindLong(26, g2);
                    }
                }
                else {
                    e.bindNull(25);
                    e.bindNull(26);
                }
                final MediaSize y = d0.y;
                if (y != null) {
                    final Integer f3 = y.f;
                    if (f3 == null) {
                        e.bindNull(27);
                    }
                    else {
                        e.bindLong(27, f3);
                    }
                    final Integer g3 = y.g;
                    if (g3 == null) {
                        e.bindNull(28);
                    }
                    else {
                        e.bindLong(28, g3);
                    }
                }
                else {
                    e.bindNull(27);
                    e.bindNull(28);
                }
                final String a2 = d0.a;
                if (a2 == null) {
                    e.bindNull(29);
                }
                else {
                    e.bindString(29, a2);
                }
            }
        };
        this.m = new w(f) {
            public final String b() {
                return "\n      UPDATE account\n      SET coins = ?\n      WHERE name = ?\n    ";
            }
        };
        this.n = new w(f) {
            public final String b() {
                return "\n      UPDATE account\n      SET isGold = ?,\n      isPremiumSubscriber = ?,\n      premiumExpirationUtc = ?\n      WHERE name = ?\n    ";
            }
        };
        this.o = new w(f) {
            public final String b() {
                return "\n    DELETE FROM userSocialLink WHERE username = ?\n    ";
            }
        };
        this.p = new w(f) {
            public final String b() {
                return "\n    DELETE FROM userMyReddits WHERE username = ?\n    ";
            }
        };
    }
    
    @Override
    public final void B(final i60.a a, final List<c0> list, final d0 d0, final List<b0> list2) {
        this.f.c();
        try {
            a$a.a((a)this, a, (List)list, d0, (List)list2);
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final n<List<c0>> B1(final String s) {
        final o a = j5.o.a(1, "\n    SELECT * FROM userSocialLink WHERE username = ?\n    ");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        return (n<List<c0>>)nf2.n.n((Callable)new b$g(this, a));
    }
    
    @Override
    public final n<List<b0>> E1(final String s) {
        final o a = j5.o.a(1, "\n    SELECT * FROM userMyReddits WHERE username = ?\n    ");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        return (n<List<b0>>)nf2.n.n((Callable)new b$h(this, a));
    }
    
    public final long F(final Object o) {
        final i60.a a = (i60.a)o;
        this.f.b();
        this.f.c();
        try {
            final long h = this.g.h(a);
            this.f.q();
            return h;
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void I1(final d0 d0) {
        this.f.c();
        try {
            ah2.f.f((Object)d0, "userSubreddit");
            if (this.l1(d0) == -1L) {
                this.U1(d0);
            }
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void M0(final String s) {
        this.f.b();
        final n5.e a = this.o.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.f.c();
        try {
            a.executeUpdateDelete();
            this.f.q();
        }
        finally {
            this.f.m();
            this.o.c(a);
        }
    }
    
    @Override
    public final n<j60.a> M1(final String s) {
        final o a = j5.o.a(1, "\n    SELECT * FROM account a\n    LEFT OUTER JOIN user_subreddit s ON s.username = a.name\n    LEFT OUTER JOIN account_mutations m ON m.parentAccountId = a.accountId\n    WHERE a.name = ?\n  ");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        return (n<j60.a>)nf2.n.n((Callable)new b$f(this, a));
    }
    
    public final void U1(final d0 d0) {
        this.f.b();
        this.f.c();
        try {
            this.l.e(d0);
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final nf2.a d(final String s, final boolean b, final boolean b2, final long n) {
        return nf2.a.q((Callable)new b$e(this, b, b2, n, s));
    }
    
    @Override
    public final nf2.a f(final int n, final String s) {
        return nf2.a.q((Callable)new c(this, n, s));
    }
    
    @Override
    public final void j0(final c0 c0) {
        this.f.b();
        this.f.c();
        try {
            this.i.f(c0);
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    public final long l1(final d0 d0) {
        this.f.b();
        this.f.c();
        try {
            final long h = this.h.h(d0);
            this.f.q();
            return h;
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final g<j60.a> p1(final String s) {
        final o a = j5.o.a(1, "\n    SELECT * FROM account a\n    LEFT OUTER JOIN user_subreddit s ON s.username = a.name\n    LEFT OUTER JOIN account_mutations m ON m.parentAccountId = a.accountId\n    WHERE a.name = ?\n  ");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        final RoomDatabase f = this.f;
        final b$i b$i = new b$i(this, a);
        final Object a2 = u.a;
        final Executor b = f.b;
        final nf2.b0 a3 = mg2.a.a;
        final ExecutorScheduler executorScheduler = new ExecutorScheduler(b);
        return (g<j60.a>)nf2.g.create((j)new q(f, new String[] { "account", "user_subreddit", "account_mutations" }), BackpressureStrategy.LATEST).subscribeOn((nf2.b0)executorScheduler).unsubscribeOn((nf2.b0)executorScheduler).observeOn((nf2.b0)executorScheduler).flatMapMaybe((sf2.o)new r(RxJavaPlugins.onAssembly((n)new zf2.g((Callable)b$i))));
    }
    
    public final int update(final Object o) {
        final i60.a a = (i60.a)o;
        this.f.b();
        this.f.c();
        try {
            final int e = this.k.e(a);
            this.f.q();
            this.f.m();
            return e + 0;
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void w(final String s) {
        this.f.b();
        final n5.e a = this.p.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.f.c();
        try {
            a.executeUpdateDelete();
            this.f.q();
        }
        finally {
            this.f.m();
            this.p.c(a);
        }
    }
    
    @Override
    public final void x(final i60.a a) {
        this.f.c();
        try {
            if (this.F(a) == -1L) {
                this.update(a);
            }
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
    
    @Override
    public final void x1(final b0 b0) {
        this.f.b();
        this.f.c();
        try {
            this.j.f(b0);
            this.f.q();
        }
        finally {
            this.f.m();
        }
    }
}
