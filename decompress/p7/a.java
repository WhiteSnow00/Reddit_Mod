// 
// Decompiled by Procyon v0.6.0
// 

package p7;

import ch2.l0;
import kotlin.Triple;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import th2.r;
import android.util.Patterns;
import com.squareup.moshi.y;
import java.io.IOException;
import com.reddit.domain.chat.model.SendBirdDataV1;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import com.reddit.domain.model.DiscussionType;
import w71.c$a;
import w71.c$c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.predictions.SubredditPredictionsTournamentState;
import w71.c$b;
import java.util.List;
import com.reddit.domain.model.SubmitPredictionsParameters;
import com.reddit.domain.model.Subreddit;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.snoovatar.model.AccessoryModel;
import com.reddit.domain.snoovatar.model.SnoovatarModel;
import java.util.Iterator;
import oi2.t;
import ch2.d0;
import ch2.b0;
import oi2.u0;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import java.util.Collection;
import ch2.x;
import o1.k0;
import n2.g;
import n2.l;
import n2.o;
import android.text.style.StyleSpan;
import i2.a$a;
import android.text.Spanned;
import z0.d$a;
import iw0.i;
import iw0.k;
import com.reddit.marketplace.impl.screens.nft.detail.ProductDetailsScreen;
import com.reddit.marketplace.domain.NavigationOrigin;
import io.reactivex.disposables.CompositeDisposable;
import mg2.q;
import java.util.Arrays;
import z0.m0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.content.Context;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import ng2.e;
import java.util.ArrayList;
import ch2.w;
import android.content.res.Resources;
import u7.b;
import u7.c;
import ff2.h;
import yc.f;

public class a implements x9.a, f, h
{
    public static final db1.a A;
    public static final a B;
    public static final a C;
    public static final c f;
    public static final b g;
    public static final db1.a h;
    public static final db1.a i;
    public static final byte[] j;
    public static final byte[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public static final long[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final int[] x;
    public static final db1.a y;
    public static final db1.a z;
    
    static {
        f = new c();
        g = new b();
        h = new db1.a("3c60a5d8a5aa", "GetFreeBuilderItems", "query GetFreeBuilderItems { avatarBuilderCatalog { __typename distributionCampaigns {\n          __typename distributionCampaignId name listings { __typename id totalQuantity soldQuantity\n          status item { __typename id name benefits { __typename avatarOutfit { __typename id\n          preRenderImage { __typename url } backgroundImage { __typename url } } } } } } } }");
        i = new db1.a("464b576c34ac", "GetStorefrontPaginated", "query GetStorefrontPaginated($filter: StorefrontListingsFilter, $before:\n          String, $after: String, $first: Int) { avatarStorefront { __typename\n          listings(filter: $filter, before: $before, after: $after, first:\n          $first) { __typename ...gqlStorefrontListings pageInfo { __typename\n          ...fullPageInfoFragment } } } } fragment gqlStorefrontListings on\n          StorefrontListingConnection { __typename pageInfo { __typename startCursor } edges {\n          __typename node { __typename ...gqlStorefrontListing } } } fragment gqlStorefrontListing\n          on StorefrontListing { __typename id totalQuantity soldQuantity productOffer { __typename\n          pricePackages { __typename ...gqlPricePackage } } status item { __typename id name artist\n          { __typename redditorInfo { __typename id } } benefits { __typename avatarOutfit {\n          __typename id preRenderImage { __typename url } backgroundImage { __typename url } } } }\n          expiresAt } fragment gqlPricePackage on ProductPurchasePackage { __typename id\n          externalProductId requiredPaymentProviders currency price quantity } fragment\n          fullPageInfoFragment on PageInfo { __typename hasNextPage hasPreviousPage startCursor\n          endCursor }");
        j = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        k = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        l = new int[] { -21389, -2, -1, -1, -1 };
        m = new int[] { 457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1 };
        n = new int[] { -457489321, -42779, -2, -1, -1, 42777, 2 };
        o = new int[] { -6803, -2, -1, -1, -1, -1, -1 };
        p = new int[] { 46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1 };
        q = new int[] { -46280809, -13607, -2, -1, -1, -1, -1, 13605, 2 };
        r = new int[] { -1, -1, -1, 0, 0, 0, 1, -1 };
        s = new int[] { 1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2 };
        t = new long[] { 3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L };
        u = new int[] { 16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779 };
        v = new int[] { 16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867 };
        w = new int[] { 16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062 };
        x = new int[] { 16842755, 16843781 };
        y = new db1.a("611d8dd564d9", "ChatTabLiveChats", "query ChatTabLiveChats($after: String, $first: Int) { identity { __typename\n          chatTabLiveChats(after: $after, first: $first) { __typename pageInfo {\n          __typename hasNextPage endCursor } edges { __typename node { __typename post { __typename\n          id title liveCommentsWebsocket commentCount ... on SubredditPost { authorInfo { __typename\n          id displayName ... on Redditor { name } } subreddit { __typename id name styles {\n          __typename icon legacyIcon { __typename url } primaryColor } } } } engagementType\n          lastReadAt lastCommentedAt } } } } }");
        z = new db1.a("f562783b21f1", "CreateLiveChatAssociation", "mutation CreateLiveChatAssociation($postId: ID!, $engagementType:\n          EngagementType!) { createLiveChatAssociation(input: {postId: $postId,\n          engagementType: $engagementType}) { __typename ok } }");
        A = new db1.a("44c1eca91e12", "DeleteLiveChatAssociation", "mutation DeleteLiveChatAssociation($postId: ID!) { deleteLiveChatAssociation(input:\n          {postId: $postId}) { __typename ok } }");
        B = new a();
        C = new a();
    }
    
    public a() {
    }
    
    public a(final Resources resources) {
        resources.getClass();
    }
    
    public static void A(final int[] array, final int[] array2, final int[] array3) {
        final int[] array4 = new int[10];
        ai2.h.W(array, array2, array4);
        M(array4, array3);
    }
    
    public static void B(final long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[18];
        v(array, K(array2), array4);
        N(array4, array3);
    }
    
    public static void C(final int[] array, final int[] array2, final int[] array3) {
        final int[] array4 = new int[14];
        ai2.h.X(array, array2, array4);
        O(array4, array3);
    }
    
    public static void D(final int[] array, final int[] array2, final int[] array3) {
        final int[] array4 = new int[16];
        android.support.v4.media.b.g2(array, array2, array4);
        P(array4, array3);
    }
    
    public static void E(final int[] array, final int[] array2, final int[] array3) {
        if ((ai2.h.Y(array, array2, array3) != 0 || (array3[9] == -1 && android.support.v4.media.b.J1(10, array3, a.m))) && android.support.v4.media.b.L0(7, a.n, array3) != 0) {
            android.support.v4.media.b.P1(10, 7, array3);
        }
    }
    
    public static void F(final long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[18];
        v(array, K(array2), array4);
        for (int i = 0; i < 18; ++i) {
            array3[i] ^= array4[i];
        }
    }
    
    public static void G(final long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[18];
        v(array, array2, array4);
        N(array4, array3);
    }
    
    public static final ArrayList H(final w w, final yh2.c c) {
        e.f((Object)w, "<this>");
        e.f((Object)c, "fqName");
        final ArrayList list = new ArrayList();
        h(w, c, list);
        return list;
    }
    
    public static final String I(final int n, final Object[] array, final d d) {
        d.A(1477071467);
        final q a = ComposerKt.a;
        final String quantityString = ((Context)d.u((m0)AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(2131820630, n, Arrays.copyOf(array, array.length));
        e.e((Object)quantityString, "LocalContext.current.res\u2026d, quantity, *formatArgs)");
        d.H();
        return quantityString;
    }
    
    public static final void J(final CompositeDisposable compositeDisposable, final df2.a a) {
        e.g((Object)compositeDisposable, "$this$plusAssign");
        e.g((Object)a, "disposable");
        compositeDisposable.add(a);
    }
    
    public static long[] K(final long[] array) {
        final long[] array2 = new long[288];
        System.arraycopy(array, 0, array2, 9, 9);
        int n = 7;
        int n2 = 0;
        long n3;
        while (true) {
            n3 = 0L;
            if (n <= 0) {
                break;
            }
            final int n4 = n2 + 18;
            long n5;
            for (int i = 0; i < 9; ++i, n3 = n5) {
                n5 = array2[(n4 >>> 1) + i];
                array2[n4 + i] = (n3 >>> 63 | n5 << 1);
            }
            final int n6 = n4 + 8;
            final long n7 = array2[n6];
            final long n8 = n7 >>> 59;
            array2[n4] ^= (n8 << 10 ^ (n8 << 2 ^ n8 ^ n8 << 5));
            array2[n6] = (n7 & 0x7FFFFFFFFFFFFFFL);
            for (int j = 0; j < 9; ++j) {
                array2[n4 + 9 + j] = (array2[9 + j] ^ array2[n4 + j]);
            }
            --n;
            n2 = n4;
        }
        long n9;
        for (int k = 0; k < 144; ++k, n3 = n9) {
            n9 = array2[0 + k];
            array2[144 + k] = (n3 >>> -4 | n9 << 4);
        }
        return array2;
    }
    
    public static ProductDetailsScreen L(final iw0.h h, final NavigationOrigin navigationOrigin, nx0.b b, final int n) {
        if ((n & 0x4) != 0x0) {
            b = null;
        }
        e.f((Object)navigationOrigin, "navigationOrigin");
        return new ProductDetailsScreen(h, navigationOrigin, (k)b, (i)null);
    }
    
    public static void M(final int[] array, final int[] array2) {
        final long n = (long)21389 & 0xFFFFFFFFL;
        final long n2 = (long)array[5] & 0xFFFFFFFFL;
        final long n3 = n * n2 + ((long)array[0] & 0xFFFFFFFFL) + 0L;
        final int n4 = (int)n3;
        array2[0] = n4;
        final long n5 = (long)array[6] & 0xFFFFFFFFL;
        final long n6 = n * n5 + n2 + ((long)array[1] & 0xFFFFFFFFL) + (n3 >>> 32);
        final int n7 = (int)n6;
        array2[1] = n7;
        final long n8 = (long)array[7] & 0xFFFFFFFFL;
        final long n9 = n * n8 + n5 + ((long)array[2] & 0xFFFFFFFFL) + (n6 >>> 32);
        final int n10 = (int)n9;
        array2[2] = n10;
        final long n11 = (long)array[8] & 0xFFFFFFFFL;
        final long n12 = n * n11 + n8 + ((long)array[3] & 0xFFFFFFFFL) + (n9 >>> 32);
        final int n13 = (int)n12;
        array2[3] = n13;
        final long n14 = (long)array[9] & 0xFFFFFFFFL;
        final long n15 = n * n14 + n11 + ((long)array[4] & 0xFFFFFFFFL) + (n12 >>> 32);
        array2[4] = (int)n15;
        final long n16 = (n15 >>> 32) + n14;
        final long n17 = n16 & 0xFFFFFFFFL;
        final long n18 = n * n17 + ((long)n4 & 0xFFFFFFFFL) + 0L;
        array2[0] = (int)n18;
        final long n19 = n16 >>> 32;
        final long n20 = n * n19 + n17 + ((long)n7 & 0xFFFFFFFFL) + (n18 >>> 32);
        array2[1] = (int)n20;
        final long n21 = n19 + ((long)n10 & 0xFFFFFFFFL) + (n20 >>> 32);
        array2[2] = (int)n21;
        final long n22 = (n21 >>> 32) + ((long)n13 & 0xFFFFFFFFL);
        array2[3] = (int)n22;
        int q1;
        if (n22 >>> 32 == 0L) {
            q1 = 0;
        }
        else {
            q1 = android.support.v4.media.b.Q1(5, 4, array2);
        }
        if (q1 != 0 || (array2[4] == -1 && ai2.h.D(array2, a.l))) {
            android.support.v4.media.b.y0(5, 21389, array2);
        }
    }
    
    public static void N(final long[] array, final long[] array2) {
        final long n = array[9];
        final long n2 = array[17];
        final long n3 = n ^ n2 >>> 59 ^ n2 >>> 57 ^ n2 >>> 54 ^ n2 >>> 49;
        long n4 = n2 << 15 ^ (array[8] ^ n2 << 5 ^ n2 << 7 ^ n2 << 10);
        for (int i = 16; i >= 10; --i) {
            final long n5 = array[i];
            array2[i - 8] = (n4 ^ n5 >>> 59 ^ n5 >>> 57 ^ n5 >>> 54 ^ n5 >>> 49);
            n4 = (array[i - 9] ^ n5 << 5 ^ n5 << 7 ^ n5 << 10 ^ n5 << 15);
        }
        array2[1] = (n4 ^ n3 >>> 59 ^ n3 >>> 57 ^ n3 >>> 54 ^ n3 >>> 49);
        final long n6 = array[0];
        final long n7 = array2[8];
        final long n8 = n7 >>> 59;
        array2[0] = (n3 << 15 ^ (n6 ^ n3 << 5 ^ n3 << 7 ^ n3 << 10) ^ n8 ^ n8 << 2 ^ n8 << 5 ^ n8 << 10);
        array2[8] = (0x7FFFFFFFFFFFFFFL & n7);
    }
    
    public static void O(final int[] array, final int[] array2) {
        final long n = (long)6803 & 0xFFFFFFFFL;
        final long n2 = (long)array[7] & 0xFFFFFFFFL;
        final long n3 = n * n2 + ((long)array[0] & 0xFFFFFFFFL) + 0L;
        final int n4 = (int)n3;
        array2[0] = n4;
        final long n5 = (long)array[8] & 0xFFFFFFFFL;
        final long n6 = n * n5 + n2 + ((long)array[1] & 0xFFFFFFFFL) + (n3 >>> 32);
        final int n7 = (int)n6;
        array2[1] = n7;
        final long n8 = (long)array[9] & 0xFFFFFFFFL;
        final long n9 = n * n8 + n5 + ((long)array[2] & 0xFFFFFFFFL) + (n6 >>> 32);
        final int n10 = (int)n9;
        array2[2] = n10;
        final long n11 = (long)array[10] & 0xFFFFFFFFL;
        final long n12 = n * n11 + n8 + ((long)array[3] & 0xFFFFFFFFL) + (n9 >>> 32);
        final int n13 = (int)n12;
        array2[3] = n13;
        final long n14 = (long)array[11] & 0xFFFFFFFFL;
        final long n15 = n * n14 + n11 + ((long)array[4] & 0xFFFFFFFFL) + (n12 >>> 32);
        array2[4] = (int)n15;
        final long n16 = (long)array[12] & 0xFFFFFFFFL;
        final long n17 = n * n16 + n14 + ((long)array[5] & 0xFFFFFFFFL) + (n15 >>> 32);
        array2[5] = (int)n17;
        final long n18 = (long)array[13] & 0xFFFFFFFFL;
        final long n19 = n * n18 + n16 + ((long)array[6] & 0xFFFFFFFFL) + (n17 >>> 32);
        array2[6] = (int)n19;
        final long n20 = (n19 >>> 32) + n18;
        final long n21 = n20 & 0xFFFFFFFFL;
        final long n22 = n * n21 + ((long)n4 & 0xFFFFFFFFL) + 0L;
        array2[0] = (int)n22;
        final long n23 = n20 >>> 32;
        final long n24 = n * n23 + n21 + ((long)n7 & 0xFFFFFFFFL) + (n22 >>> 32);
        array2[1] = (int)n24;
        final long n25 = n23 + ((long)n10 & 0xFFFFFFFFL) + (n24 >>> 32);
        array2[2] = (int)n25;
        final long n26 = (n25 >>> 32) + ((long)n13 & 0xFFFFFFFFL);
        array2[3] = (int)n26;
        int q1;
        if (n26 >>> 32 == 0L) {
            q1 = 0;
        }
        else {
            q1 = android.support.v4.media.b.Q1(7, 4, array2);
        }
        if (q1 != 0 || (array2[6] == -1 && ai2.h.E(array2, a.o))) {
            android.support.v4.media.b.y0(7, 6803, array2);
        }
    }
    
    public static void P(final int[] array, final int[] array2) {
        final long n = array[8];
        final long n2 = (long)array[9] & 0xFFFFFFFFL;
        final long n3 = (long)array[10] & 0xFFFFFFFFL;
        final long n4 = (long)array[11] & 0xFFFFFFFFL;
        final long n5 = (long)array[12] & 0xFFFFFFFFL;
        final long n6 = (long)array[13] & 0xFFFFFFFFL;
        final long n7 = (long)array[14] & 0xFFFFFFFFL;
        final long n8 = (long)array[15] & 0xFFFFFFFFL;
        final long n9 = (n & 0xFFFFFFFFL) - 6L;
        final long n10 = n2 + n3;
        final long n11 = n3 + n4 - n8;
        final long n12 = n4 + n5;
        final long n13 = n5 + n6;
        final long n14 = n6 + n7;
        final long n15 = n7 + n8;
        final long n16 = n14 - (n9 + n2);
        final long n17 = ((long)array[0] & 0xFFFFFFFFL) - n12 - n16 + 0L;
        array2[0] = (int)n17;
        final long n18 = ((long)array[1] & 0xFFFFFFFFL) + n10 - n13 - n15 + (n17 >> 32);
        array2[1] = (int)n18;
        final long n19 = ((long)array[2] & 0xFFFFFFFFL) + n11 - n14 + (n18 >> 32);
        array2[2] = (int)n19;
        final long n20 = ((long)array[3] & 0xFFFFFFFFL) + (n12 << 1) + n16 - n15 + (n19 >> 32);
        array2[3] = (int)n20;
        final long n21 = ((long)array[4] & 0xFFFFFFFFL) + (n13 << 1) + n7 - n10 + (n20 >> 32);
        array2[4] = (int)n21;
        final long n22 = ((long)array[5] & 0xFFFFFFFFL) + (n14 << 1) - n11 + (n21 >> 32);
        array2[5] = (int)n22;
        final long n23 = ((long)array[6] & 0xFFFFFFFFL) + (n15 << 1) + n16 + (n22 >> 32);
        array2[6] = (int)n23;
        final long n24 = ((long)array[7] & 0xFFFFFFFFL) + (n8 << 1) + n9 - n11 - n13 + (n23 >> 32);
        array2[7] = (int)n24;
        S((int)((n24 >> 32) + 6L), array2);
    }
    
    public static void Q(int q1, final int[] array) {
        Label_0127: {
            if (q1 != 0) {
                final long n = 21389;
                final long n2 = (long)q1 & 0xFFFFFFFFL;
                q1 = 0;
                final long n3 = (n & 0xFFFFFFFFL) * n2 + ((long)array[0] & 0xFFFFFFFFL) + 0L;
                array[0] = (int)n3;
                final long n4 = n2 + ((long)array[1] & 0xFFFFFFFFL) + (n3 >>> 32);
                array[1] = (int)n4;
                final long n5 = (n4 >>> 32) + (0xFFFFFFFFL & (long)array[2]);
                array[2] = (int)n5;
                if (n5 >>> 32 != 0L) {
                    q1 = android.support.v4.media.b.Q1(5, 3, array);
                }
                if (q1 != 0) {
                    break Label_0127;
                }
            }
            if (array[4] != -1 || !ai2.h.D(array, a.l)) {
                return;
            }
        }
        android.support.v4.media.b.y0(5, 21389, array);
    }
    
    public static void R(int q1, final int[] array) {
        Label_0129: {
            if (q1 != 0) {
                final long n = 6803;
                final long n2 = (long)q1 & 0xFFFFFFFFL;
                q1 = 0;
                final long n3 = (n & 0xFFFFFFFFL) * n2 + ((long)array[0] & 0xFFFFFFFFL) + 0L;
                array[0] = (int)n3;
                final long n4 = n2 + ((long)array[1] & 0xFFFFFFFFL) + (n3 >>> 32);
                array[1] = (int)n4;
                final long n5 = (n4 >>> 32) + (0xFFFFFFFFL & (long)array[2]);
                array[2] = (int)n5;
                if (n5 >>> 32 != 0L) {
                    q1 = android.support.v4.media.b.Q1(7, 3, array);
                }
                if (q1 != 0) {
                    break Label_0129;
                }
            }
            if (array[6] != -1 || !ai2.h.E(array, a.o)) {
                return;
            }
        }
        android.support.v4.media.b.y0(7, 6803, array);
    }
    
    public static void S(final int n, final int[] array) {
        long n15;
        if (n != 0) {
            final long n2 = (long)n & 0xFFFFFFFFL;
            final long n3 = ((long)array[0] & 0xFFFFFFFFL) + n2 + 0L;
            array[0] = (int)n3;
            long n5;
            final long n4 = n5 = n3 >> 32;
            if (n4 != 0L) {
                final long n6 = n4 + ((long)array[1] & 0xFFFFFFFFL);
                array[1] = (int)n6;
                final long n7 = (n6 >> 32) + ((long)array[2] & 0xFFFFFFFFL);
                array[2] = (int)n7;
                n5 = n7 >> 32;
            }
            final long n8 = ((long)array[3] & 0xFFFFFFFFL) - n2 + n5;
            array[3] = (int)n8;
            long n10;
            final long n9 = n10 = n8 >> 32;
            if (n9 != 0L) {
                final long n11 = n9 + ((long)array[4] & 0xFFFFFFFFL);
                array[4] = (int)n11;
                final long n12 = (n11 >> 32) + ((long)array[5] & 0xFFFFFFFFL);
                array[5] = (int)n12;
                n10 = n12 >> 32;
            }
            final long n13 = ((long)array[6] & 0xFFFFFFFFL) - n2 + n10;
            array[6] = (int)n13;
            final long n14 = (0xFFFFFFFFL & (long)array[7]) + n2 + (n13 >> 32);
            array[7] = (int)n14;
            n15 = n14 >> 32;
        }
        else {
            n15 = 0L;
        }
        if (n15 != 0L || (array[7] == -1 && android.support.v4.media.b.M1(array, a.r))) {
            d(array);
        }
    }
    
    public static final com.airbnb.lottie.compose.b T(final Integer n, final Integer n2, final String[] array, final d d) {
        e.f((Object)array, "keyPath");
        d.A(1613443783);
        d.A(-3686930);
        final boolean m = d.m((Object)array);
        final Object b = d.B();
        v6.d d2;
        if (m || (d2 = (v6.d)b) == d$a.a) {
            d2 = new v6.d((String[])Arrays.copyOf(array, array.length));
            d.w((Object)d2);
        }
        d.H();
        final v6.d d3 = d2;
        d.A(-3686095);
        final boolean i = d.m((Object)d3);
        final boolean j = d.m((Object)n);
        final boolean k = d.m((Object)n2);
        final Object b2 = d.B();
        com.airbnb.lottie.compose.b b3;
        if ((i | j | k) || (b3 = (com.airbnb.lottie.compose.b)b2) == d$a.a) {
            b3 = new com.airbnb.lottie.compose.b(n, d3, n2);
            d.w((Object)b3);
        }
        d.H();
        final com.airbnb.lottie.compose.b b4 = b3;
        d.H();
        return b4;
    }
    
    public static final void U(int i, final int n, final Object[] array) {
        e.f((Object)array, "<this>");
        while (i < n) {
            array[i] = null;
            ++i;
        }
    }
    
    public static final int V(final double n) {
        if (!Double.isNaN(n)) {
            int n2;
            if (n > 2.147483647E9) {
                n2 = Integer.MAX_VALUE;
            }
            else if (n < -2.147483648E9) {
                n2 = Integer.MIN_VALUE;
            }
            else {
                n2 = (int)Math.round(n);
            }
            return n2;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    public static final int W(final float n) {
        if (!Float.isNaN(n)) {
            return Math.round(n);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    public static final long X(final double n) {
        if (!Double.isNaN(n)) {
            return Math.round(n);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    public static void Y(final int[] array, final int[] array2) {
        final int[] array3 = new int[10];
        ai2.h.c0(array, array3);
        M(array3, array2);
    }
    
    public static void Z(final long[] array, final long[] array2) {
        final long[] array3 = new long[18];
        w(array, array3);
        N(array3, array2);
    }
    
    public static void a0(final int[] array, final int[] array2) {
        final int[] array3 = new int[14];
        ai2.h.d0(array, array3);
        O(array3, array2);
    }
    
    public static void b(final long[] array, final long[] array2, final long[] array3) {
        for (int i = 0; i < 9; ++i) {
            array3[i] = (array[i] ^ array2[i]);
        }
    }
    
    public static void b0(final int[] array, final int[] array2) {
        final int[] array3 = new int[16];
        android.support.v4.media.b.y2(array, array3);
        P(array3, array2);
    }
    
    public static void c(final long[] array, final long[] array2, final long[] array3) {
        for (int i = 0; i < 9; ++i) {
            array3[i] ^= (array[i] ^ array2[i]);
        }
    }
    
    public static void c0(int n, final int[] array, final int[] array2) {
        final int[] array3 = new int[10];
        ai2.h.c0(array, array3);
        while (true) {
            M(array3, array2);
            if (--n <= 0) {
                break;
            }
            ai2.h.c0(array2, array3);
        }
    }
    
    public static void d(final int[] array) {
        final long n = ((long)array[0] & 0xFFFFFFFFL) + 1L;
        array[0] = (int)n;
        long n3;
        final long n2 = n3 = n >> 32;
        if (n2 != 0L) {
            final long n4 = n2 + ((long)array[1] & 0xFFFFFFFFL);
            array[1] = (int)n4;
            final long n5 = (n4 >> 32) + ((long)array[2] & 0xFFFFFFFFL);
            array[2] = (int)n5;
            n3 = n5 >> 32;
        }
        final long n6 = ((long)array[3] & 0xFFFFFFFFL) - 1L + n3;
        array[3] = (int)n6;
        long n8;
        final long n7 = n8 = n6 >> 32;
        if (n7 != 0L) {
            final long n9 = n7 + ((long)array[4] & 0xFFFFFFFFL);
            array[4] = (int)n9;
            final long n10 = (n9 >> 32) + ((long)array[5] & 0xFFFFFFFFL);
            array[5] = (int)n10;
            n8 = n10 >> 32;
        }
        final long n11 = ((long)array[6] & 0xFFFFFFFFL) - 1L + n8;
        array[6] = (int)n11;
        array[7] = (int)((0xFFFFFFFFL & (long)array[7]) + 1L + (n11 >> 32));
    }
    
    public static void d0(int n, final long[] array, final long[] array2) {
        final long[] array3 = new long[18];
        w(array, array3);
        while (true) {
            N(array3, array2);
            if (--n <= 0) {
                break;
            }
            w(array2, array3);
        }
    }
    
    public static final void e(final CompositeDisposable compositeDisposable, final df2.a a) {
        e.g((Object)a, "$this$addTo");
        e.g((Object)compositeDisposable, "compositeDisposable");
        compositeDisposable.add(a);
    }
    
    public static void e0(int n, final int[] array, final int[] array2) {
        final int[] array3 = new int[14];
        ai2.h.d0(array, array3);
        while (true) {
            O(array3, array2);
            if (--n <= 0) {
                break;
            }
            ai2.h.d0(array2, array3);
        }
    }
    
    public static final i2.a f(int i, final Object[] array, final d d) {
        d.A(1950142597);
        final q a = ComposerKt.a;
        final Resources resources = ((Context)d.u((m0)AndroidCompositionLocals_androidKt.b)).getResources();
        d.A(511388516);
        final boolean m = d.m((Object)i);
        final boolean j = d.m((Object)array);
        final Object b = d.B();
        i2.a k;
        if ((m | j) || (k = (i2.a)b) == d$a.a) {
            e.e((Object)resources, "resources");
            final Object[] copy = Arrays.copyOf(array, array.length);
            e.f((Object)copy, "args");
            final ArrayList list = new ArrayList<Object>(copy.length);
            for (Object s1 : copy) {
                final Object o = s1;
                if (o instanceof Spanned) {
                    final Spanned spanned = (Spanned)o;
                    e.f((Object)spanned, "<this>");
                    final String c = y3.b.c(spanned, 0);
                    e.e((Object)c, "toHtml(this, HtmlCompat.\u2026AGRAPH_LINES_CONSECUTIVE)");
                    final String m2 = kotlin.text.b.m1(c, "<p dir=\"ltr\">", c);
                    s1 = kotlin.text.b.s1(m2, "</p>", m2);
                }
                list.add(s1);
            }
            final Object[] array2 = list.toArray(new Object[0]);
            e.d((Object)array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final String string = resources.getText(i).toString();
            final Object[] copy2 = Arrays.copyOf(array2, array2.length);
            final String format = String.format(string, Arrays.copyOf(copy2, copy2.length));
            e.e((Object)format, "format(format, *args)");
            final Spanned a2 = y3.b.a(format, 0);
            e.e((Object)a2, "fromHtml(String.format(g\u2026at.FROM_HTML_MODE_LEGACY)");
            final a$a a$a = new a$a(0);
            a$a.d(a2.toString());
            final Object[] spans = a2.getSpans(0, ((CharSequence)a2).length(), (Class)Object.class);
            e.e((Object)spans, "text.getSpans(0, text.length, Any::class.java)");
            int length2;
            Object o2;
            int spanStart;
            int spanEnd;
            int style;
            for (length2 = spans.length, i = 0; i < length2; ++i) {
                o2 = spans[i];
                spanStart = a2.getSpanStart(o2);
                spanEnd = a2.getSpanEnd(o2);
                if (o2 instanceof StyleSpan) {
                    style = ((StyleSpan)o2).getStyle();
                    if (style != 0) {
                        if (style != 1) {
                            if (style != 2) {
                                if (style == 3) {
                                    a$a.b(new i2.k(0L, 0L, n2.o.p, new n2.k(1), (l)null, (g)null, (String)null, 0L, (t2.a)null, (t2.i)null, (p2.d)null, 0L, (t2.g)null, (k0)null, 16371), spanStart, spanEnd);
                                }
                            }
                            else {
                                a$a.b(new i2.k(0L, 0L, n2.o.m, new n2.k(1), (l)null, (g)null, (String)null, 0L, (t2.a)null, (t2.i)null, (p2.d)null, 0L, (t2.g)null, (k0)null, 16371), spanStart, spanEnd);
                            }
                        }
                        else {
                            a$a.b(new i2.k(0L, 0L, n2.o.p, new n2.k(0), (l)null, (g)null, (String)null, 0L, (t2.a)null, (t2.i)null, (p2.d)null, 0L, (t2.g)null, (k0)null, 16371), spanStart, spanEnd);
                        }
                    }
                    else {
                        a$a.b(new i2.k(0L, 0L, n2.o.m, new n2.k(0), (l)null, (g)null, (String)null, 0L, (t2.a)null, (t2.i)null, (p2.d)null, 0L, (t2.g)null, (k0)null, 16371), spanStart, spanEnd);
                    }
                }
                else {
                    a$a.b(new i2.k(0L, 0L, (o)null, (n2.k)null, (l)null, (g)null, (String)null, 0L, (t2.a)null, (t2.i)null, (p2.d)null, 0L, (t2.g)null, (k0)null, 16383), spanStart, spanEnd);
                }
            }
            k = a$a.i();
            d.w((Object)k);
        }
        d.H();
        final i2.a a3 = k;
        final q a4 = ComposerKt.a;
        d.H();
        return a3;
    }
    
    public static void f0(int n, final int[] array, final int[] array2) {
        final int[] array3 = new int[16];
        android.support.v4.media.b.y2(array, array3);
        while (true) {
            P(array3, array2);
            if (--n <= 0) {
                break;
            }
            android.support.v4.media.b.y2(array2, array3);
        }
    }
    
    public static final Object[] g(final int n) {
        if (n >= 0) {
            return new Object[n];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
    
    public static void g0(final int[] array, final int[] array2, final int[] array3) {
        if (ai2.h.e0(array, array2, array3) != 0) {
            android.support.v4.media.b.G2(5, 21389, array3);
        }
    }
    
    public static final void h(final w w, final yh2.c c, final ArrayList list) {
        e.f((Object)w, "<this>");
        e.f((Object)c, "fqName");
        if (w instanceof x) {
            ((x)w).b(c, list);
        }
        else {
            list.addAll(w.a(c));
        }
    }
    
    public static void h0(final int[] array, final int[] array2, final int[] array3) {
        if (ai2.h.f0(array, array2, array3) != 0) {
            android.support.v4.media.b.G2(7, 6803, array3);
        }
    }
    
    public static String i(final kotlin.reflect.jvm.internal.impl.descriptors.d d, int n) {
        final int n2 = 1;
        final boolean b = (n & 0x1) != 0x0;
        if ((n & 0x2) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        e.f((Object)d, "<this>");
        final StringBuilder sb = new StringBuilder();
        if (n != 0) {
            String c;
            if (d instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                c = "<init>";
            }
            else {
                c = ((ch2.g)d).getName().c();
                e.e((Object)c, "name.asString()");
            }
            sb.append(c);
        }
        sb.append("(");
        final d0 d2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).d0();
        if (d2 != null) {
            final t type = ((l0)d2).getType();
            e.e((Object)type, "it.type");
            sb.append(z(type));
        }
        final Iterator iterator = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).g().iterator();
        while (iterator.hasNext()) {
            final t type2 = ((l0)iterator.next()).getType();
            e.e((Object)type2, "parameter.type");
            sb.append(z(type2));
        }
        sb.append(")");
        if (b) {
            Label_0291: {
                if (d instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                    n = n2;
                }
                else {
                    final t returnType = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).getReturnType();
                    e.c((Object)returnType);
                    final yh2.e e = kotlin.reflect.jvm.internal.impl.builtins.c.e;
                    if (kotlin.reflect.jvm.internal.impl.builtins.c.E(returnType, e$a.d)) {
                        final t returnType2 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).getReturnType();
                        ng2.e.c((Object)returnType2);
                        if (!u0.g(returnType2) && !(d instanceof b0)) {
                            n = n2;
                            break Label_0291;
                        }
                    }
                    n = 0;
                }
            }
            if (n != 0) {
                sb.append("V");
            }
            else {
                final t returnType3 = ((kotlin.reflect.jvm.internal.impl.descriptors.a)d).getReturnType();
                e.c((Object)returnType3);
                sb.append(z(returnType3));
            }
        }
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static void i0(final int[] array, final int[] array2, final int[] array3) {
        if (android.support.v4.media.b.F2(array, array2, array3) != 0) {
            final long n = ((long)array3[0] & 0xFFFFFFFFL) - 1L;
            array3[0] = (int)n;
            long n3;
            final long n2 = n3 = n >> 32;
            if (n2 != 0L) {
                final long n4 = n2 + ((long)array3[1] & 0xFFFFFFFFL);
                array3[1] = (int)n4;
                final long n5 = (n4 >> 32) + ((long)array3[2] & 0xFFFFFFFFL);
                array3[2] = (int)n5;
                n3 = n5 >> 32;
            }
            final long n6 = ((long)array3[3] & 0xFFFFFFFFL) + 1L + n3;
            array3[3] = (int)n6;
            long n8;
            final long n7 = n8 = n6 >> 32;
            if (n7 != 0L) {
                final long n9 = n7 + ((long)array3[4] & 0xFFFFFFFFL);
                array3[4] = (int)n9;
                final long n10 = (n9 >> 32) + ((long)array3[5] & 0xFFFFFFFFL);
                array3[5] = (int)n10;
                n8 = n10 >> 32;
            }
            final long n11 = ((long)array3[6] & 0xFFFFFFFFL) + 1L + n8;
            array3[6] = (int)n11;
            array3[7] = (int)((0xFFFFFFFFL & (long)array3[7]) - 1L + (n11 >> 32));
        }
    }
    
    public static final String j(kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        e.f((Object)a, "<this>");
        if (ai2.d.o((ch2.g)a)) {
            return null;
        }
        final ch2.g b = ((ch2.h)a).b();
        ch2.c c;
        if (b instanceof ch2.c) {
            c = (ch2.c)b;
        }
        else {
            c = null;
        }
        if (c == null) {
            return null;
        }
        if (((ch2.g)c).getName().g) {
            return null;
        }
        a = a.a();
        Object o;
        if (a instanceof kotlin.reflect.jvm.internal.impl.descriptors.f) {
            o = a;
        }
        else {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return zd.b.d1(c, i((kotlin.reflect.jvm.internal.impl.descriptors.d)o, 3));
    }
    
    public static final a72.d j0(final SnoovatarModel snoovatarModel) {
        e.f((Object)snoovatarModel, "<this>");
        final Set h = snoovatarModel.h;
        final ArrayList list = new ArrayList();
        final Iterator iterator = h.iterator();
        while (iterator.hasNext()) {
            dg2.o.B4((Iterable)((AccessoryModel)iterator.next()).k, (Collection)list);
        }
        return new a72.d(snoovatarModel.g, CollectionsKt___CollectionsKt.M5((Iterable)list));
    }
    
    public static String k(final byte[] array, final byte[] array2) {
        final byte[] array3 = new byte[(array.length + 2) / 3 * 4];
        int n = array.length - array.length % 3;
        int i = 0;
        int n2 = 0;
        while (i < n) {
            final int n3 = n2 + 1;
            array3[n2] = array2[(array[i] & 0xFF) >> 2];
            final int n4 = n3 + 1;
            final byte b = array[i];
            final int n5 = i + 1;
            array3[n3] = array2[(b & 0x3) << 4 | (array[n5] & 0xFF) >> 4];
            final int n6 = n4 + 1;
            final byte b2 = array[n5];
            final int n7 = i + 2;
            array3[n4] = array2[(b2 & 0xF) << 2 | (array[n7] & 0xFF) >> 6];
            n2 = n6 + 1;
            array3[n6] = array2[array[n7] & 0x3F];
            i += 3;
        }
        final int n8 = array.length % 3;
        if (n8 != 1) {
            if (n8 == 2) {
                final int n9 = n2 + 1;
                array3[n2] = array2[(array[n] & 0xFF) >> 2];
                final int n10 = n9 + 1;
                final byte b3 = array[n];
                ++n;
                array3[n9] = array2[(array[n] & 0xFF) >> 4 | (b3 & 0x3) << 4];
                array3[n10] = array2[(array[n] & 0xF) << 2];
                array3[n10 + 1] = 61;
            }
        }
        else {
            final int n11 = n2 + 1;
            array3[n2] = array2[(array[n] & 0xFF) >> 2];
            final int n12 = n11 + 1;
            array3[n11] = array2[(array[n] & 0x3) << 4];
            array3[n12 + 1] = (array3[n12] = 61);
        }
        try {
            return new String(array3, "US-ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static final SubmitPredictionsParameters k0(final w71.b b, final Subreddit subreddit, final String s, String kindWithId) {
        final SubmitPredictionsParameters.PredictionDraft predictionDraft = new SubmitPredictionsParameters.PredictionDraft(s, b.a.a(), kindWithId, b.b);
        final w71.c c = b.c;
        SubmitPredictionsParameters.PostAction postAction;
        if (c instanceof c$b) {
            final SubredditPredictionsTournamentState a = ((c$b)c).a;
            if (e.a((Object)a, (Object)SubredditPredictionsTournamentState.Disabled.INSTANCE)) {
                postAction = new SubmitPredictionsParameters.PostAction.PostStandalone(predictionDraft);
            }
            else if (a instanceof SubredditPredictionsTournamentState.HasLiveTournament) {
                postAction = new SubmitPredictionsParameters.PostAction.PostToExistingTournament(((SubredditPredictionsTournamentState.HasLiveTournament)a).getTournament().getTournamentId(), predictionDraft);
            }
            else if (e.a((Object)a, (Object)SubredditPredictionsTournamentState.NoLiveTournaments.INSTANCE)) {
                postAction = new SubmitPredictionsParameters.PostAction.CreateTournament("Predictions Tournament", cg.d.l3((Object)predictionDraft), null, 4, null);
            }
            else {
                if (e.a((Object)a, (Object)SubredditPredictionsTournamentState.LoadingTournaments.INSTANCE)) {
                    throw new IllegalStateException("LoadingTournaments shouldn't occur at this stage.");
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        else {
            if (e.a((Object)c, (Object)c$c.a)) {
                throw new IllegalStateException("Tournament state is not loaded yet.");
            }
            if (!(c instanceof c$a)) {
                throw new NoWhenBranchMatchedException();
            }
            postAction = new SubmitPredictionsParameters.PostAction.CreateTournament(((c$a)b.c).a, cg.d.l3((Object)predictionDraft), ((c$a)b.c).b);
        }
        kindWithId = subreddit.getKindWithId();
        return new SubmitPredictionsParameters(subreddit.getDisplayName(), s, null, null, null, false, false, kindWithId, postAction, 124, null);
    }
    
    public static final kw0.c l(final List list) {
        e.f((Object)list, "<this>");
        final Iterator iterator = list.iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                final kw0.c c = (kw0.c)next;
                int n = c.b * c.a;
                kw0.c c2 = (kw0.c)next;
                do {
                    final Object next2 = iterator.next();
                    final kw0.c c3 = (kw0.c)next2;
                    final int n2 = c3.b * c3.a;
                    next = c2;
                    int n3;
                    if ((n3 = n) < n2) {
                        next = next2;
                        n3 = n2;
                    }
                    c2 = (kw0.c)next;
                    n = n3;
                } while (iterator.hasNext());
            }
        }
        return (kw0.c)next;
    }
    
    public static final ug2.d m(final Annotation annotation) {
        e.f((Object)annotation, "<this>");
        final Class<? extends Annotation> annotationType = annotation.annotationType();
        e.e((Object)annotationType, "this as java.lang.annota\u2026otation).annotationType()");
        final ug2.d a = ng2.h.a((Class)annotationType);
        e.d((Object)a, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a;
    }
    
    public static final yh2.b n(final wh2.c c, final int n) {
        e.f((Object)c, "<this>");
        return yh2.b.f(c.a(n), c.b(n));
    }
    
    public static long o(final Object o) {
        e.f(o, "item");
        return -Math.abs((long)o.hashCode());
    }
    
    public static final Class p(final ug2.d d) {
        e.f((Object)d, "<this>");
        final Class e = ((ng2.a)d).e();
        ng2.e.d((Object)e, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return e;
    }
    
    public static final Class q(final ug2.d d) {
        e.f((Object)d, "<this>");
        Serializable e = ((ng2.a)d).e();
        if (!((Class)e).isPrimitive()) {
            return (Class)e;
        }
        final String name = ((Class)e).getName();
        switch (name) {
            case "short": {
                e = Short.class;
                break;
            }
            case "float": {
                e = Float.class;
                break;
            }
            case "boolean": {
                e = Boolean.class;
                break;
            }
            case "void": {
                e = Void.class;
                break;
            }
            case "long": {
                e = Long.class;
                break;
            }
            case "char": {
                e = Character.class;
                break;
            }
            case "byte": {
                e = Byte.class;
                break;
            }
            case "int": {
                e = Integer.class;
                break;
            }
            case "double": {
                e = Double.class;
                break;
            }
            default:
                break;
        }
        return (Class)e;
    }
    
    public static final Class r(final ug2.d d) {
        e.f((Object)d, "<this>");
        final Class e = ((ng2.a)d).e();
        if (e.isPrimitive()) {
            return e;
        }
        final String name = e.getName();
        switch (name) {
            case "java.lang.Double": {
                final Serializable s = Double.TYPE;
                return (Class)s;
            }
            case "java.lang.Void": {
                final Serializable s = Void.TYPE;
                return (Class)s;
            }
            case "java.lang.Long": {
                final Serializable s = Long.TYPE;
                return (Class)s;
            }
            case "java.lang.Byte": {
                final Serializable s = Byte.TYPE;
                return (Class)s;
            }
            case "java.lang.Boolean": {
                final Serializable s = Boolean.TYPE;
                return (Class)s;
            }
            case "java.lang.Character": {
                final Serializable s = Character.TYPE;
                return (Class)s;
            }
            case "java.lang.Short": {
                final Serializable s = Short.TYPE;
                return (Class)s;
            }
            case "java.lang.Float": {
                final Serializable s = Float.TYPE;
                return (Class)s;
            }
            case "java.lang.Integer": {
                final Serializable s = Integer.TYPE;
                return (Class)s;
            }
            default:
                break;
        }
        final Serializable s = null;
        return (Class)s;
    }
    
    public static final yh2.e s(final wh2.c c, final int n) {
        e.f((Object)c, "<this>");
        return yh2.e.e(c.getString(n));
    }
    
    public static SendBirdDataV1 t(final String s) {
        final SendBirdDataV1 sendBirdDataV1 = null;
        SendBirdDataV1 sendBirdDataV2;
        try {
            final y a = y10.e.a;
            Object fromJson;
            if (s.length() == 0) {
                fromJson = null;
            }
            else {
                fromJson = y10.e.a.a((Class)SendBirdDataV1.class).fromJson(s);
            }
            sendBirdDataV2 = (SendBirdDataV1)fromJson;
        }
        catch (final IOException ex) {
            pu2.a.a.f((Throwable)ex, "SendBirdDataV1 unmarshallData exception", new Object[0]);
            sendBirdDataV2 = sendBirdDataV1;
        }
        return sendBirdDataV2;
    }
    
    public static final int u(int n) {
        if (n < 0) {
            n = -1;
        }
        else if (n > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public static void v(final long[] array, final long[] array2, final long[] array3) {
        final int n = 56;
        int n2 = 56;
        int i;
        while (true) {
            long n3 = 0L;
            i = n;
            if (n2 < 0) {
                break;
            }
            for (int j = 1; j < 9; j += 2) {
                final int n4 = (int)(array[j] >>> n2);
                for (int k = 0; k < 9; ++k) {
                    final int n5 = j - 1 + k;
                    array3[n5] ^= (array2[(n4 & 0xF) * 9 + k] ^ array2[((n4 >>> 4 & 0xF) + 16) * 9 + k]);
                }
            }
            long n7;
            for (int l = 0; l < 16; ++l, n3 = n7) {
                final int n6 = 0 + l;
                n7 = array3[n6];
                array3[n6] = (n3 >>> -8 | n7 << 8);
            }
            n2 -= 8;
        }
        while (i >= 0) {
            for (int n8 = 0; n8 < 9; n8 += 2) {
                final int n9 = (int)(array[n8] >>> i);
                for (int n10 = 0; n10 < 9; ++n10) {
                    final int n11 = n8 + n10;
                    array3[n11] ^= (array2[(n9 & 0xF) * 9 + n10] ^ array2[((n9 >>> 4 & 0xF) + 16) * 9 + n10]);
                }
            }
            if (i > 0) {
                long n12 = 0L;
                long n15;
                for (int n13 = 0; n13 < 18; ++n13, n12 = n15) {
                    final int n14 = 0 + n13;
                    n15 = array3[n14];
                    array3[n14] = (n12 >>> -8 | n15 << 8);
                }
            }
            i -= 8;
        }
    }
    
    public static void w(final long[] array, final long[] array2) {
        ah0.b.b0(0, array[0], array2);
        ah0.b.b0(2, array[1], array2);
        ah0.b.b0(4, array[2], array2);
        ah0.b.b0(6, array[3], array2);
        ah0.b.b0(8, array[4], array2);
        ah0.b.b0(10, array[5], array2);
        ah0.b.b0(12, array[6], array2);
        ah0.b.b0(14, array[7], array2);
        ah0.b.b0(16, array[8], array2);
    }
    
    public static final boolean x(final w w, final yh2.c c) {
        e.f((Object)w, "<this>");
        e.f((Object)c, "fqName");
        boolean b;
        if (w instanceof x) {
            b = ((x)w).c(c);
        }
        else {
            b = H(w, c).isEmpty();
        }
        return b;
    }
    
    public static boolean y(final CharSequence charSequence) {
        boolean b = true;
        if (charSequence == null || charSequence.length() <= 0 || !Patterns.WEB_URL.matcher(charSequence).matches()) {
            b = false;
        }
        return b;
    }
    
    public static final th2.i z(final t t) {
        return (th2.i)zd.b.A0(t, th2.r.k, FunctionsKt.b);
    }
    
    public Map a() {
        return new HashMap();
    }
    
    public Object apply(final Object o, final Object o2, final Object o3) {
        e.g(o, "t1");
        e.g(o2, "t2");
        e.g(o3, "t3");
        return new Triple(o, o2, o3);
    }
}
