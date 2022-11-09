// 
// Decompiled by Procyon v0.6.0
// 

package a80;

import com.instabug.library.core.eventbus.eventpublisher.AbstractEventPublisher;
import com.instabug.library.model.BaseReport;
import com.reddit.data.model.v1.Thing;
import com.reddit.data.model.v1.ThingWrapper;
import android.widget.TextView;
import java.util.TreeMap;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import android.os.IInterface;
import ig.t0;
import ig.u0;
import android.os.IBinder;
import android.os.Handler;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import pj2.y;
import java.io.PrintStream;
import z0.h0;
import com.reddit.ui.AvatarView;
import com.reddit.tracking.TrackerParams;
import java.util.LinkedHashMap;
import h91.i$a;
import h91.i$b;
import h91.i$c;
import android.graphics.drawable.LayerDrawable;
import h91.h$b;
import com.reddit.common.experiments.model.onboarding.PostingInOnboardingVariant;
import com.instabug.library.model.State;
import com.instabug.bug.testingreport.ReportUploadingStateEventBus;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.internal.storage.DiskUtils;
import o1.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$Theme;
import z0.d$a$a;
import android.content.res.Resources;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.ref.WeakReference;
import android.util.TypedValue;
import hw0.d0;
import androidx.compose.ui.draw.PainterModifier;
import o1.s;
import androidx.compose.ui.graphics.painter.Painter;
import com.reddit.data.model.v1.Listing;
import com.reddit.data.model.v1.More;
import com.reddit.data.model.v1.MoreWrapper;
import com.reddit.data.model.v1.ReplyableWrapper;
import com.reddit.data.model.v1.Replyable;
import com.reddit.screen.notification.model.ReplyableTreeNode;
import com.reddit.screen.notification.model.collapsetree.CollapseTree;
import com.reddit.recap.impl.screen.models.RecapCardUiModel$m;
import androidx.compose.runtime.ActualAndroid_androidKt;
import z0.a1;
import um1.f$d;
import um1.f$b;
import um1.f$e;
import um1.f$c;
import um1.f$a;
import com.reddit.events.snoovatar.SnoovatarAnalytics$SortFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageButton;
import j$.time.OffsetDateTime;
import com.reddit.themes.RedditThemedActivity;
import com.bluelinelabs.conductor.Controller;
import we0.b$b;
import kotlin.NoWhenBranchMatchedException;
import we0.b$a;
import we0.b$c;
import com.reddit.domain.snoovatar.model.storefront.StorefrontListing;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import com.instabug.library.model.Attachment;
import com.instabug.library.core.InstabugCore;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.content.res.Configuration;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.appcompat.widget.s0;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.foundation.layout.SpacerMeasurePolicy;
import a4.u1;
import mj2.c0;
import androidx.compose.ui.text.platform.AndroidParagraph;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import androidx.fragment.app.r;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.reddit.domain.powerups.PowerupsBenefit;
import androidx.compose.ui.graphics.SimpleGraphicsLayerModifier;
import o1.v;
import o1.f0;
import o1.q0;
import o1.l0;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import java.util.ListIterator;
import com.reddit.domain.image.model.ImageResolution;
import java.util.NoSuchElementException;
import android.text.SpannableString;
import mj2.v0;
import java.io.Serializable;
import com.reddit.domain.model.UserSubreddit;
import java.nio.charset.Charset;
import kotlin.Pair;
import qg2.j;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.util.Base64;
import com.reddit.domain.snoovatar.model.SnoovatarModel;
import com.reddit.domain.model.MediaMetaData;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.FlairRichTextItem;
import com.reddit.domain.model.SubredditDetail;
import java.util.Map;
import com.reddit.listing.model.Listable$Type;
import f92.j0;
import lm0.h$a;
import com.reddit.domain.awards.model.Award;
import com.reddit.frontpage.presentation.detail.CommentSavableStatus;
import kotlin.collections.EmptySet;
import com.reddit.frontpage.presentation.detail.ActionButtonsSortOrder;
import com.reddit.frontpage.presentation.detail.ActionButtonsAlignment;
import com.reddit.frontpage.presentation.detail.ChatVotingState;
import lm0.x1;
import com.reddit.domain.model.AbbreviatedComment;
import com.reddit.ui.awards.model.CommentAwardsUiModel;
import com.reddit.frontpage.presentation.AuthorRoleIndicator;
import java.util.Set;
import lm0.l2;
import com.reddit.domain.model.Comment;
import lm0.h1;
import com.reddit.frontpage.presentation.detail.more_comments.MoreCommentsButtonStyle;
import com.reddit.domain.model.MoreComment;
import jm0.a$a;
import com.reddit.domain.model.Subreddit;
import com.reddit.frontpage.presentation.communities.model.CommunityPresentationSection;
import com.reddit.frontpage.presentation.communities.model.CommunityPresentationModelType;
import java.util.Iterator;
import com.reddit.structuredstyles.model.ImagePresentationModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.structuredstyles.model.widgets.Image;
import com.reddit.structuredstyles.model.widgets.ImageWidget;
import com.reddit.structuredstyles.model.ExtraActionPresentationModel;
import java.util.Collection;
import java.util.Arrays;
import android.text.Html;
import com.reddit.structuredstyles.model.FlairRichTextItemType;
import com.reddit.structuredstyles.model.StructuredStylesFlairRichTextItem;
import com.reddit.structuredstyles.model.widgets.Moderator;
import com.reddit.structuredstyles.model.ModeratorPresentationModel;
import java.util.ArrayList;
import qg2.m;
import com.reddit.structuredstyles.model.widgets.ModeratorWidget;
import com.reddit.structuredstyles.model.CommunityPresentationModel;
import com.reddit.structuredstyles.model.widgets.CommunityType;
import com.reddit.structuredstyles.model.widgets.Community;
import com.reddit.structuredstyles.model.widgets.CommunityListWidget;
import com.reddit.structuredstyles.model.RulePresentationModel;
import com.reddit.structuredstyles.model.widgets.RuleDisplayType;
import com.reddit.structuredstyles.model.widgets.Rule;
import com.reddit.structuredstyles.model.widgets.RuleWidget;
import com.reddit.structuredstyles.model.ButtonPresentationModel;
import com.reddit.structuredstyles.model.widgets.ButtonType;
import com.reddit.structuredstyles.model.widgets.Button;
import com.reddit.structuredstyles.model.ButtonDescriptionPresentationModel;
import com.reddit.structuredstyles.model.widgets.ButtonWidget;
import com.reddit.structuredstyles.model.CalendarEventPresentationModel;
import d22.d$a;
import com.reddit.structuredstyles.model.widgets.CalendarEvent;
import kotlin.collections.EmptyList;
import com.reddit.structuredstyles.model.widgets.CalendarWidget;
import com.reddit.structuredstyles.model.TextAreaBodyPresentationModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.structuredstyles.model.WidgetPresentationModelType;
import com.reddit.structuredstyles.model.HeaderPresentationModel;
import com.reddit.structuredstyles.model.WidgetPresentationModel;
import com.reddit.structuredstyles.model.widgets.TextAreaWidget;
import com.reddit.structuredstyles.model.widgets.BaseWidget;
import androidx.recyclerview.widget.RecyclerView;
import g11.a$b;
import java.util.Locale;
import d22.g;
import z10.w;
import com.reddit.common.ThingType;
import com.reddit.data.events.models.components.Post$Builder;
import com.reddit.data.events.models.components.Post;
import com.reddit.domain.model.Link;
import java.lang.annotation.Annotation;
import tg.h;
import z0.c1;
import z0.b1;
import androidx.compose.runtime.DerivedSnapshotState;
import l0.i;
import l0.g0;
import android.content.Context;
import com.reddit.ui.image.Shape;
import android.graphics.drawable.InsetDrawable;
import com.reddit.frontpage.image.NsfwDrawable;
import com.reddit.frontpage.image.NsfwDrawable$Shape;
import android.view.View;
import eg.n0;
import android.graphics.Color;
import android.text.TextUtils;
import android.app.Activity;
import n42.e;
import android.widget.ImageView;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3;
import zg2.p;
import android.graphics.drawable.Drawable;
import com.reddit.ui.button.RedditButton$ButtonIconPosition;
import com.reddit.ui.button.RedditButton;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import ah2.f;
import zg2.l;
import java.util.List;
import com.google.android.exoplayer2.source.hls.playlist.d;
import mj2.o0;
import ke.o7;
import ke.n7;
import xj2.b;
import rj2.t;
import ig.k;
import b6.c;

public class a implements c, k, kj.k
{
    public static final t A;
    public static final t B;
    public static final b[] f;
    public static final String[] g;
    public static final long[] i;
    public static final a j;
    public static final int[] k;
    public static final int[] l;
    public static final n7 m;
    public static final o7 n;
    public static final t o;
    public static final t p;
    public static final t q;
    public static final t r;
    public static final t s;
    public static final o0 t;
    public static final o0 u;
    public static final a v;
    public static final t w;
    public static final t x;
    public static final t y;
    public static final t z;
    
    public static final tg2.c A(final l l, final tg2.c c) {
        ah2.f.f((Object)l, "<this>");
        ah2.f.f((Object)c, "completion");
        Object create;
        if (l instanceof BaseContinuationImpl) {
            create = ((BaseContinuationImpl)l).create(c);
        }
        else {
            final CoroutineContext context = c.getContext();
            if (context == EmptyCoroutineContext.INSTANCE) {
                create = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(c, l);
            }
            else {
                create = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(c, context, l);
            }
        }
        return (tg2.c)create;
    }
    
    public static final void A0(final RedditButton redditButton, final boolean b) {
        ((TextView)redditButton).setText(2131957429);
        if (b) {
            redditButton.setButtonIcon(n3.a.getDrawable(((View)redditButton).getContext(), 2131231868));
            redditButton.setButtonIconPosition(RedditButton$ButtonIconPosition.START);
            redditButton.setButtonIconSize(Integer.valueOf(((View)redditButton).getResources().getDimensionPixelSize(2131165399)));
        }
        else {
            redditButton.setButtonIcon((Drawable)null);
        }
    }
    
    public static final tg2.c B(final p p3, final Object o, final tg2.c c) {
        ah2.f.f((Object)p3, "<this>");
        ah2.f.f((Object)c, "completion");
        Object create;
        if (p3 instanceof BaseContinuationImpl) {
            create = ((BaseContinuationImpl)p3).create(o, c);
        }
        else {
            final CoroutineContext context = c.getContext();
            if (context == EmptyCoroutineContext.INSTANCE) {
                create = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(c, p3, o);
            }
            else {
                create = new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(c, context, p3, o);
            }
        }
        return (tg2.c)create;
    }
    
    public static final void B0(final ImageView imageView, final String s, final String s2, final Integer n, final Integer n2, final Integer n3, final Integer n4, final boolean b, final boolean b2) {
        ah2.f.f((Object)imageView, "iconView");
        final e e = (e)imageView;
        final Context context = ((View)e).getContext();
        if (context instanceof Activity && aj2.c.R0(context).isDestroyed()) {
            return;
        }
        int n5;
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            n5 = Color.parseColor(s2);
        }
        else if (n != null) {
            n5 = n;
        }
        else if (n2 != null) {
            ah2.f.e((Object)context, "context");
            n5 = ah2.c.D((int)n2, context);
        }
        else if (n3 != null) {
            n5 = n3.a.getColor(context, n3);
        }
        else {
            ah2.f.e((Object)context, "context");
            int n6;
            if (b) {
                n6 = 2130969579;
            }
            else {
                n6 = 2130969577;
            }
            n5 = ah2.c.D(n6, context);
        }
        ((View)imageView).setPadding(0, 0, 0, 0);
        if (b2) {
            ((com.bumptech.glide.j)n0.R0(context)).clear((View)imageView);
            imageView.setImageDrawable((Drawable)new NsfwDrawable(context, NsfwDrawable$Shape.SQUARE));
        }
        else if (TextUtils.isEmpty((CharSequence)s)) {
            ((com.bumptech.glide.j)n0.R0(context)).clear((View)imageView);
            Drawable drawable;
            if (n4 != null) {
                if (n4 == Integer.valueOf(2131232107)) {
                    drawable = ah2.c.C0(context, (int)n4, n3.a.getColor(context, 2131100534));
                    n5 = -1;
                }
                else {
                    drawable = ah2.c.B0(context, (int)n4, 2130969651);
                }
            }
            else {
                int n7;
                if (b) {
                    n7 = 2131232468;
                }
                else {
                    n7 = 2131231955;
                }
                drawable = ah2.c.B0(context, n7, 2130969651);
            }
            imageView.setImageDrawable((Drawable)new InsetDrawable(drawable, ((View)e).getResources().getDimensionPixelSize(2131166844)));
        }
        else {
            ((com.bumptech.glide.i)n0.R0(context).r(s)).into(imageView);
        }
        e.setShape(Shape.CIRCLE);
        final Drawable background = ((View)e).getBackground();
        ah2.f.e((Object)background, "iconView.background");
        ah2.c.z0(n5, background);
    }
    
    public static final i C(final g0 g0, final Object o) {
        ah2.f.f((Object)g0, "<this>");
        final i i = (i)g0.a().invoke(o);
        ah2.f.f((Object)i, "<this>");
        return i.c();
    }
    
    public static void C0(final ImageView imageView, final String s, final String s2) {
        ah2.f.f((Object)imageView, "targetView");
        B0(imageView, s, s2, null, null, null, null, false, false);
    }
    
    public static final DerivedSnapshotState D(final zg2.a a) {
        final c1 a2 = b1.a;
        ah2.f.f((Object)a, "calculation");
        return new DerivedSnapshotState(a);
    }
    
    public static void D0(final List list, final h h, final int n, final int n2) {
        int size = list.size();
        int n4;
        while (true) {
            final int n3 = size - 1;
            if (n3 <= (n4 = n2)) {
                break;
            }
            size = n3;
            if (!h.apply(list.get(n3))) {
                continue;
            }
            list.remove(n3);
            size = n3;
        }
        while (--n4 >= n) {
            list.remove(n4);
        }
    }
    
    public static final int E(final Object... array) {
        final int length = array.length;
        int n = 17;
        for (final Object o : array) {
            int n2 = 0;
            Label_0205: {
                if (o == null) {
                    n2 = 0;
                }
                else {
                    if (!(o instanceof Integer)) {
                        if (!(o instanceof Character)) {
                            if (!(o instanceof Short)) {
                                if (!(o instanceof Byte)) {
                                    if (o instanceof Boolean) {
                                        if (o) {
                                            n2 = 1231;
                                            break Label_0205;
                                        }
                                        n2 = 1237;
                                        break Label_0205;
                                    }
                                    else {
                                        if (o instanceof Float) {
                                            n2 = Float.floatToRawIntBits(((Number)o).floatValue());
                                            break Label_0205;
                                        }
                                        long n3;
                                        if (o instanceof Long) {
                                            n3 = ((Number)o).longValue();
                                        }
                                        else {
                                            if (!(o instanceof Double)) {
                                                n2 = o.hashCode();
                                                break Label_0205;
                                            }
                                            n3 = Double.doubleToRawLongBits(((Number)o).doubleValue());
                                        }
                                        n2 = (int)(n3 ^ n3 >>> 32);
                                        break Label_0205;
                                    }
                                }
                            }
                        }
                    }
                    n2 = (int)o;
                }
            }
            n = n * 31 + n2;
        }
        return n;
    }
    
    public static void E0(int n, final long[] array, final long[] array2) {
        final long[] array3 = new long[5];
        Y(array, array3);
        while (true) {
            u0(array3, array2);
            if (--n <= 0) {
                break;
            }
            Y(array2, array3);
        }
    }
    
    public static final hh2.d F(final Annotation annotation) {
        ah2.f.f((Object)annotation, "<this>");
        final Class<? extends Annotation> annotationType = annotation.annotationType();
        ah2.f.e((Object)annotationType, "this as java.lang.annota\u2026otation).annotationType()");
        final hh2.d a = ah2.i.a((Class)annotationType);
        ah2.f.d((Object)a, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return a;
    }
    
    public static final Post F0(final Link link) {
        ah2.f.f((Object)link, "<this>");
        final Post$Builder domain = new Post$Builder().id(z10.w.e(link.getKindWithId(), ThingType.LINK)).type(ah.a.o(link)).title(link.getTitle()).nsfw(Boolean.valueOf(link.getOver18())).spoiler(Boolean.valueOf(link.getSpoiler())).url(link.getUrl()).domain(link.getDomain());
        final int b = d22.g.b;
        final Post$Builder subreddit_id = domain.created_timestamp(Long.valueOf(d22.g.a(link.getCreatedUtc()))).subreddit_id(link.getSubredditId());
        final String subreddit = link.getSubreddit();
        final Locale us = Locale.US;
        ah2.f.e((Object)us, "US");
        final String lowerCase = subreddit.toLowerCase(us);
        ah2.f.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
        final Post build = subreddit_id.subreddit_name(lowerCase).promoted(Boolean.valueOf(link.getPromoted())).build();
        ah2.f.e((Object)build, "Builder()\n    .id(ThingU\u2026ed(promoted)\n    .build()");
        return build;
    }
    
    public static final int G(final kh2.b b) {
        ah2.f.f((Object)b, "<this>");
        return b.a().size();
    }
    
    public static final e11.a G0(final a$b a$b) {
        ah2.f.f((Object)a$b, "<this>");
        return new e11.a(a$b.a, a$b.b, a$b.c, a$b.d, a$b.e, a$b.f, a$b.g, a$b.h, a$b.i, a$b.j);
    }
    
    public static final Integer H(final RecyclerView.f0 f0) {
        ah2.f.f((Object)f0, "<this>");
        Integer value = f0.getBindingAdapterPosition();
        if (value.intValue() == -1) {
            value = null;
        }
        return value;
    }
    
    public static final List H0(final BaseWidget baseWidget, final q20.b b, final d22.d d) {
        ah2.f.f((Object)b, "resourceProvider");
        ah2.f.f((Object)d, "dateFormatterDelegate");
        Object o;
        if (baseWidget instanceof TextAreaWidget) {
            final TextAreaWidget textAreaWidget = (TextAreaWidget)baseWidget;
            o = ah2.c.Y((Object[])new WidgetPresentationModel[] { (WidgetPresentationModel)new HeaderPresentationModel((WidgetPresentationModelType)null, textAreaWidget.getShortName(), (Integer)null, 5, (DefaultConstructorMarker)null), (WidgetPresentationModel)new TextAreaBodyPresentationModel((WidgetPresentationModelType)null, textAreaWidget.getTextHtml(), 1, (DefaultConstructorMarker)null) });
        }
        else if (baseWidget instanceof CalendarWidget) {
            final CalendarWidget calendarWidget = (CalendarWidget)baseWidget;
            if (calendarWidget.getData().isEmpty()) {
                o = EmptyList.INSTANCE;
            }
            else {
                final ArrayList a0 = ah2.c.a0((Object[])new WidgetPresentationModel[] { (WidgetPresentationModel)new HeaderPresentationModel((WidgetPresentationModelType)null, calendarWidget.getShortName(), (Integer)null, 5, (DefaultConstructorMarker)null) });
                final Iterator iterator = calendarWidget.getData().iterator();
                int n = 0;
                while (true) {
                    final boolean b2 = true;
                    o = a0;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final Object next = iterator.next();
                    if (n < 0) {
                        ah2.c.x0();
                        throw null;
                    }
                    final CalendarEvent calendarEvent = (CalendarEvent)next;
                    final String titleHtml = calendarEvent.getTitleHtml();
                    int n2 = b2 ? 1 : 0;
                    if (titleHtml != null) {
                        if (titleHtml.length() == 0) {
                            n2 = (b2 ? 1 : 0);
                        }
                        else {
                            n2 = 0;
                        }
                    }
                    String s;
                    if (n2 == 0) {
                        s = calendarEvent.getTitleHtml();
                    }
                    else {
                        s = calendarEvent.getTitle();
                    }
                    final Long startTime = calendarEvent.getStartTime();
                    String a2;
                    if (startTime != null) {
                        a2 = d$a.a(d, startTime.longValue() * 1000, calendarWidget.getConfiguration().getShowTime(), 4);
                    }
                    else {
                        a2 = null;
                    }
                    a0.add(new CalendarEventPresentationModel((WidgetPresentationModelType)null, s, a2, calendarEvent.getDescription(), calendarWidget.getConfiguration().getShowTime(), calendarWidget.getConfiguration().getShowDescription(), calendarWidget.getConfiguration().getShowTitle(), calendarWidget.getConfiguration().getShowDate(), n != ah2.c.L(calendarWidget.getData()), 1, (DefaultConstructorMarker)null));
                    ++n;
                }
            }
        }
        else if (baseWidget instanceof ButtonWidget) {
            final ButtonWidget buttonWidget = (ButtonWidget)baseWidget;
            if (!buttonWidget.getData().isEmpty()) {
                final HeaderPresentationModel headerPresentationModel = new HeaderPresentationModel((WidgetPresentationModelType)null, buttonWidget.getShortName(), (Integer)null, 5, (DefaultConstructorMarker)null);
                final String descriptionHtml = buttonWidget.getDescriptionHtml();
                String s2;
                if (descriptionHtml != null && descriptionHtml.length() != 0) {
                    s2 = buttonWidget.getDescriptionHtml();
                }
                else {
                    s2 = buttonWidget.getDescription();
                }
                final ArrayList a3 = ah2.c.a0((Object[])new WidgetPresentationModel[] { (WidgetPresentationModel)headerPresentationModel, (WidgetPresentationModel)new ButtonDescriptionPresentationModel((WidgetPresentationModelType)null, s2, 1, (DefaultConstructorMarker)null) });
                final Iterator iterator2 = buttonWidget.getData().iterator();
                int n3 = 0;
                while (true) {
                    o = a3;
                    if (!iterator2.hasNext()) {
                        return (List)o;
                    }
                    final Object next2 = iterator2.next();
                    if (n3 < 0) {
                        break;
                    }
                    final Button button = (Button)next2;
                    if (button.getKind() == ButtonType.TEXT) {
                        a3.add(new ButtonPresentationModel((WidgetPresentationModelType)null, button.getText(), button.getUrl(), Color.parseColor(button.getColor()), n3 == ah2.c.L(buttonWidget.getData()), 1, (DefaultConstructorMarker)null));
                    }
                    ++n3;
                }
                ah2.c.x0();
                throw null;
            }
            o = EmptyList.INSTANCE;
        }
        else if (baseWidget instanceof RuleWidget) {
            final RuleWidget ruleWidget = (RuleWidget)baseWidget;
            if (!ruleWidget.getData().isEmpty()) {
                final ArrayList a4 = ah2.c.a0((Object[])new WidgetPresentationModel[] { (WidgetPresentationModel)new HeaderPresentationModel((WidgetPresentationModelType)null, ruleWidget.getShortName(), (Integer)null, 5, (DefaultConstructorMarker)null) });
                final Iterator iterator3 = ruleWidget.getData().iterator();
                int n4 = 0;
                while (true) {
                    o = a4;
                    if (!iterator3.hasNext()) {
                        return (List)o;
                    }
                    final Object next3 = iterator3.next();
                    final int n5 = n4 + 1;
                    if (n4 < 0) {
                        break;
                    }
                    final Rule rule = (Rule)next3;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(n5);
                    sb.append(". ");
                    sb.append(rule.getShortName());
                    final String string = sb.toString();
                    final String descriptionHtml2 = rule.getDescriptionHtml();
                    String s3;
                    if (descriptionHtml2 != null && descriptionHtml2.length() != 0) {
                        s3 = rule.getDescriptionHtml();
                    }
                    else {
                        s3 = rule.getDescription();
                    }
                    a4.add(new RulePresentationModel((WidgetPresentationModelType)null, string, s3, ruleWidget.getDisplay() == RuleDisplayType.FULL, n4 != ah2.c.L(ruleWidget.getData()), 1, (DefaultConstructorMarker)null));
                    n4 = n5;
                }
                ah2.c.x0();
                throw null;
            }
            o = EmptyList.INSTANCE;
        }
        else if (baseWidget instanceof CommunityListWidget) {
            final CommunityListWidget communityListWidget = (CommunityListWidget)baseWidget;
            if (!communityListWidget.getData().isEmpty()) {
                final ArrayList a5 = ah2.c.a0((Object[])new WidgetPresentationModel[] { (WidgetPresentationModel)new HeaderPresentationModel((WidgetPresentationModelType)null, communityListWidget.getShortName(), (Integer)null, 5, (DefaultConstructorMarker)null) });
                final Iterator iterator4 = communityListWidget.getData().iterator();
                int n6 = 0;
                while (true) {
                    o = a5;
                    if (!iterator4.hasNext()) {
                        return (List)o;
                    }
                    final Object next4 = iterator4.next();
                    if (n6 < 0) {
                        break;
                    }
                    final Community community = (Community)next4;
                    final boolean b3 = n6 == 0;
                    final String name = community.getName();
                    final boolean subscribed = community.isSubscribed();
                    String communityIcon = community.getCommunityIcon();
                    if (!((communityIcon == null || communityIcon.length() == 0) ^ true)) {
                        communityIcon = null;
                    }
                    String iconUrl = communityIcon;
                    if (communityIcon == null) {
                        iconUrl = community.getIconUrl();
                    }
                    final long subscribers = community.getSubscribers();
                    final String primaryColor = community.getPrimaryColor();
                    final CommunityType type = community.getType();
                    String s4;
                    if (community.getType() == CommunityType.SUBREDDIT) {
                        final StringBuilder k = a.k("r/");
                        k.append(community.getName());
                        s4 = k.toString();
                    }
                    else {
                        final StringBuilder i = a.k("u/");
                        i.append(community.getName());
                        s4 = i.toString();
                    }
                    a5.add(new CommunityPresentationModel((WidgetPresentationModelType)null, b3, name, subscribed, iconUrl, subscribers, primaryColor, type, s4, n6 == ah2.c.L(communityListWidget.getData()), 1, (DefaultConstructorMarker)null));
                    ++n6;
                }
                ah2.c.x0();
                throw null;
            }
            o = EmptyList.INSTANCE;
        }
        else if (baseWidget instanceof ModeratorWidget) {
            final ModeratorWidget moderatorWidget = (ModeratorWidget)baseWidget;
            if (moderatorWidget.getData().isEmpty()) {
                o = EmptyList.INSTANCE;
            }
            else {
                final ArrayList a6 = ah2.c.a0((Object[])new WidgetPresentationModel[] { (WidgetPresentationModel)new HeaderPresentationModel((WidgetPresentationModelType)null, b.getString(HeaderPresentationModel.Companion.getMODERATORS_HEADER()), Integer.valueOf(2131232100), 1, (DefaultConstructorMarker)null) });
                final List data = moderatorWidget.getData();
                final ArrayList list = new ArrayList<ModeratorPresentationModel>(qg2.m.P0((Iterable)data, 10));
                for (final Moderator moderator : data) {
                    final String name2 = moderator.getName();
                    final List authorFlairRichText = moderator.getAuthorFlairRichText();
                    String s5;
                    if (authorFlairRichText == null || authorFlairRichText.isEmpty()) {
                        s5 = moderator.getAuthorFlairText();
                    }
                    else {
                        final List authorFlairRichText2 = moderator.getAuthorFlairRichText();
                        ah2.f.c((Object)authorFlairRichText2);
                        final StringBuilder sb2 = new StringBuilder();
                        for (final StructuredStylesFlairRichTextItem structuredStylesFlairRichTextItem : authorFlairRichText2) {
                            if (structuredStylesFlairRichTextItem.getType() == FlairRichTextItemType.Text) {
                                sb2.append(Html.escapeHtml((CharSequence)structuredStylesFlairRichTextItem.getText()));
                            }
                            else {
                                final String format = String.format("<img src=\"%s\"/>", Arrays.copyOf(new Object[] { structuredStylesFlairRichTextItem.getEmojiUrl() }, 1));
                                ah2.f.e((Object)format, "format(format, *args)");
                                sb2.append(format);
                            }
                        }
                        s5 = sb2.toString();
                        ah2.f.e((Object)s5, "stringBuilder.toString()");
                    }
                    list.add(new ModeratorPresentationModel((WidgetPresentationModelType)null, name2, s5, moderator.getAuthorFlairBackgroundColor(), moderator.getAuthorFlairTextColor(), 1, (DefaultConstructorMarker)null));
                }
                a6.addAll(list);
                if (moderatorWidget.getTotalMods() > moderatorWidget.getData().size()) {
                    a6.add(new ExtraActionPresentationModel((WidgetPresentationModelType)null, b.getString(ExtraActionPresentationModel.Companion.getVIEW_ALL_MODERATORS()), Integer.valueOf(2131232022), 1, (DefaultConstructorMarker)null));
                }
                o = a6;
            }
        }
        else if (baseWidget instanceof ImageWidget) {
            final ImageWidget imageWidget = (ImageWidget)baseWidget;
            if (imageWidget.getData().isEmpty()) {
                o = EmptyList.INSTANCE;
            }
            else {
                final ArrayList list2 = new ArrayList();
                final Image image = (Image)CollectionsKt___CollectionsKt.s1(imageWidget.getData());
                o = list2;
                if (image != null) {
                    list2.add(new ImagePresentationModel((WidgetPresentationModelType)null, image.getUrl(), image.getLinkUrl(), image.getWidth(), image.getHeight(), imageWidget.getData(), 1, (DefaultConstructorMarker)null));
                    o = list2;
                }
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (List)o;
    }
    
    public static final long I(final long n) {
        return yd.a.y0(n1.f.e(n) / 2.0f, n1.f.c(n) / 2.0f);
    }
    
    public static jm0.a I0(final CommunityPresentationModelType communityPresentationModelType, final CommunityPresentationSection communityPresentationSection, final Subreddit subreddit, final int n) {
        ah2.f.f((Object)subreddit, "subreddit");
        final String id = subreddit.getId();
        final String kindWithId = subreddit.getKindWithId();
        final String displayNamePrefixed = subreddit.getDisplayNamePrefixed();
        final String displayName = subreddit.getDisplayName();
        final String communityIcon = subreddit.getCommunityIcon();
        final String primaryColor = subreddit.getPrimaryColor();
        final Boolean userHasFavorited = subreddit.getUserHasFavorited();
        final boolean user = subreddit.isUser();
        final long a = a$a.a(subreddit.getId(), new String[] { String.valueOf(((Enum)communityPresentationSection).ordinal()) });
        final Boolean over18 = subreddit.getOver18();
        return new jm0.a(id, communityPresentationModelType, communityPresentationSection, kindWithId, displayNamePrefixed, displayName, communityIcon, primaryColor, userHasFavorited, (Integer)null, (Integer)null, (Integer)null, user, a, over18 != null && over18, n, subreddit.getPublicDescription(), 7232);
    }
    
    public static final String J(final Object o) {
        ah2.f.f(o, "<this>");
        return o.getClass().getSimpleName();
    }
    
    public static final h1 J0(final MoreComment moreComment, final q20.c c, final int n, final lm0.c1 c2, final MoreCommentsButtonStyle moreCommentsButtonStyle, final boolean b, final int n2) {
        ah2.f.f((Object)moreComment, "<this>");
        ah2.f.f((Object)c, "resourceProvider");
        ah2.f.f((Object)moreCommentsButtonStyle, "moreCommentsButtonStyle");
        return new h1(moreComment.getId(), moreComment.getKindWithId(), moreComment.getParentKindWithId(), moreComment.getDepth(), moreComment.getCount(), false, n, moreComment.getCount() == 0, ((q20.b)c).getString(2131954478), ((q20.b)c).getString(2131954765), ((q20.b)c).k(2131820588, moreComment.getCount(), new Object[] { moreComment.getCount() }), c2, moreCommentsButtonStyle, b, n2);
    }
    
    public static final com.reddit.screen.snoovatar.builder.model.a K(final zl1.h h) {
        ah2.f.f((Object)h, "<this>");
        final com.reddit.screen.snoovatar.builder.model.a a = (com.reddit.screen.snoovatar.builder.model.a)CollectionsKt___CollectionsKt.C1(h.k().b());
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("constantModel accessed before it was initialized.".toString());
    }
    
    public static lm0.h K0(final Comment comment, final l2 l2, final Set set, final AuthorRoleIndicator authorRoleIndicator, String s, String s2, final String s3, final String s4, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final Link link, int n, boolean b6, boolean b7, final CommentAwardsUiModel commentAwardsUiModel, final l i, final l j, final l k, AbbreviatedComment abbreviatedComment, final x1 x1, final ChatVotingState chatVotingState, boolean b8, final boolean b9, boolean b10, l m, final x1 x2, final lm0.c1 c1, final ActionButtonsAlignment actionButtonsAlignment, final ActionButtonsSortOrder actionButtonsSortOrder, final boolean b11, final l l3, final l l4, final l l5, int intValue, int score) {
        Object instance;
        if ((intValue & 0x2) != 0x0) {
            instance = EmptySet.INSTANCE;
        }
        else {
            instance = set;
        }
        AuthorRoleIndicator none;
        if ((intValue & 0x4) != 0x0) {
            none = AuthorRoleIndicator.NONE;
        }
        else {
            none = authorRoleIndicator;
        }
        String s5;
        if ((intValue & 0x8) != 0x0) {
            s5 = "";
        }
        else {
            s5 = s;
        }
        String s6;
        if ((intValue & 0x10) != 0x0) {
            s6 = "";
        }
        else {
            s6 = s2;
        }
        if ((intValue & 0x40) != 0x0) {
            s2 = "";
        }
        else {
            s2 = s4;
        }
        if ((intValue & 0x2000) != 0x0) {
            n = 0;
        }
        if ((intValue & 0x4000) != 0x0) {
            b6 = true;
        }
        if ((0x8000 & intValue) != 0x0) {
            b7 = true;
        }
        l l6;
        if ((0x20000 & intValue) != 0x0) {
            l6 = null;
        }
        else {
            l6 = i;
        }
        l l7;
        if ((0x40000 & intValue) != 0x0) {
            l7 = null;
        }
        else {
            l7 = j;
        }
        l l8;
        if ((0x80000 & intValue) != 0x0) {
            l8 = null;
        }
        else {
            l8 = k;
        }
        if ((0x100000 & intValue) != 0x0) {
            abbreviatedComment = null;
        }
        x1 x3;
        if ((0x200000 & intValue) != 0x0) {
            x3 = null;
        }
        else {
            x3 = x1;
        }
        if ((0x800000 & intValue) != 0x0) {
            b8 = false;
        }
        if ((0x2000000 & intValue) != 0x0) {
            b10 = false;
        }
        l l9;
        if ((0x4000000 & intValue) != 0x0) {
            l9 = null;
        }
        else {
            l9 = m;
        }
        x1 x4;
        if ((0x8000000 & intValue) != 0x0) {
            x4 = null;
        }
        else {
            x4 = x2;
        }
        ActionButtonsAlignment align_END;
        if ((0x20000000 & intValue) != 0x0) {
            align_END = ActionButtonsAlignment.ALIGN_END;
        }
        else {
            align_END = actionButtonsAlignment;
        }
        ActionButtonsSortOrder right;
        if ((intValue & 0x40000000) != 0x0) {
            right = ActionButtonsSortOrder.RIGHT;
        }
        else {
            right = actionButtonsSortOrder;
        }
        if ((score & 0x1) != 0x0) {
            m = null;
        }
        else {
            m = l3;
        }
        l l10;
        if ((score & 0x2) != 0x0) {
            l10 = null;
        }
        else {
            l10 = l4;
        }
        l l11;
        if ((score & 0x4) != 0x0) {
            l11 = null;
        }
        else {
            l11 = l5;
        }
        ah2.f.f((Object)comment, "<this>");
        ah2.f.f((Object)l2, "authorTextColor");
        ah2.f.f(instance, "indicators");
        ah2.f.f((Object)none, "roleIndicator");
        ah2.f.f((Object)s5, "flairDelimiter");
        ah2.f.f((Object)s6, "flairDescription");
        ah2.f.f((Object)s3, "dateDescription");
        ah2.f.f((Object)s2, "collapsedDescription");
        ah2.f.f((Object)link, "link");
        ah2.f.f((Object)chatVotingState, "chatVotingState");
        ah2.f.f((Object)align_END, "actionButtonsAlignment");
        ah2.f.f((Object)right, "actionButtonsOrder");
        final boolean predictionSystemComment = comment.isPredictionSystemComment();
        final String id = comment.getId();
        final String kindWithId = comment.getKindWithId();
        final String parentKindWithId = comment.getParentKindWithId();
        final int depth = comment.getDepth();
        final String bodyHtml = comment.getBodyHtml();
        final String body = comment.getBody();
        final String author = comment.getAuthor();
        final String authorKindWithId = comment.getAuthorKindWithId();
        score = comment.getScore();
        final String linkKindWithId = comment.getLinkKindWithId();
        final boolean archived = comment.getArchived();
        final Integer numReports = comment.getNumReports();
        if (numReports != null) {
            intValue = numReports;
        }
        else {
            intValue = 0;
        }
        final boolean b12 = intValue > 0;
        final boolean saved = comment.getSaved();
        final boolean b13 = !b && b2;
        final boolean b14 = !b && b2;
        final boolean b15 = b && !predictionSystemComment;
        final boolean subscribed = comment.getSubscribed();
        final boolean saved2 = comment.getSaved();
        CommentSavableStatus commentSavableStatus;
        if (predictionSystemComment) {
            commentSavableStatus = CommentSavableStatus.DISABLED;
        }
        else if (saved2) {
            commentSavableStatus = CommentSavableStatus.UNSAVE_ENABLED;
        }
        else {
            commentSavableStatus = CommentSavableStatus.SAVE_ENABLED;
        }
        final boolean b16 = b2 && !b;
        final boolean b17 = !link.getLocked() && !comment.getLocked();
        final boolean scoreHidden = comment.getScoreHidden();
        final long createdUtc = comment.getCreatedUtc();
        final String subredditId = link.getSubredditId();
        final SubredditDetail subredditDetail = link.getSubredditDetail();
        String s7;
        if (subredditDetail == null || (s7 = subredditDetail.getDisplayName()) == null) {
            s7 = link.getSubreddit();
        }
        String s8;
        if ((s8 = comment.getLinkTitle()) == null) {
            s8 = link.getTitle();
        }
        final Boolean voteState = comment.getVoteState();
        final String authorFlairTemplateId = comment.getAuthorFlairTemplateId();
        final String authorFlairBackgroundColor = comment.getAuthorFlairBackgroundColor();
        final String authorFlairTextColor = comment.getAuthorFlairTextColor();
        final String authorFlairText = comment.getAuthorFlairText();
        final List<FlairRichTextItem> authorFlairRichText = comment.getAuthorFlairRichText();
        final String authorKindWithId2 = comment.getAuthorKindWithId();
        final RichTextResponse rtjson = comment.getRtjson();
        String richTextString;
        if (rtjson != null) {
            richTextString = rtjson.getRichTextString();
        }
        else {
            richTextString = null;
        }
        final long createdUtc2 = comment.getCreatedUtc();
        final List<Award> awards = comment.getAwards();
        final ArrayList list = new ArrayList<Integer>(m.P0((Iterable)awards, 10));
        final Iterator<Object> iterator = awards.iterator();
        final String s9 = s6;
        while (iterator.hasNext()) {
            final Long count = iterator.next().getCount();
            if (count != null) {
                intValue = (int)(long)count;
            }
            else {
                intValue = 0;
            }
            list.add(intValue);
        }
        final h$a h$a = new h$a(createdUtc2, CollectionsKt___CollectionsKt.Y1((Collection)list));
        List list2;
        if (l6 != null) {
            list2 = (List)l6.invoke((Object)comment);
        }
        else {
            list2 = null;
        }
        j0 j2;
        if (l7 != null) {
            j2 = (j0)l7.invoke((Object)comment);
        }
        else {
            j2 = null;
        }
        ap0.b b18;
        if (l8 != null) {
            b18 = (ap0.b)l8.invoke((Object)comment);
        }
        else {
            b18 = null;
        }
        String author2;
        if (abbreviatedComment != null) {
            author2 = abbreviatedComment.getAuthor();
        }
        else {
            author2 = null;
        }
        String authorKindWithId3;
        if (abbreviatedComment != null) {
            authorKindWithId3 = abbreviatedComment.getAuthorKindWithId();
        }
        else {
            authorKindWithId3 = null;
        }
        Label_1144: {
            String body2 = null;
            Label_1135: {
                if (l11 != null) {
                    s = (String)l11.invoke((Object)abbreviatedComment);
                    if ((body2 = s) != null) {
                        break Label_1135;
                    }
                }
                if (abbreviatedComment == null) {
                    s = null;
                    break Label_1144;
                }
                body2 = abbreviatedComment.getBody();
            }
            s = body2;
        }
        final Map<String, MediaMetaData> mediaMetadata = comment.getMediaMetadata();
        final Award associatedAward = comment.getAssociatedAward();
        h32.a a;
        if (associatedAward != null) {
            if (l9 != null) {
                a = (h32.a)l9.invoke((Object)associatedAward);
            }
            else {
                a = null;
            }
        }
        else {
            a = null;
        }
        final boolean a2 = ah2.f.a((Object)comment.isCollapsedBecauseOfCrowdControl(), (Object)Boolean.TRUE);
        final String collapsedReasonCode = comment.getCollapsedReasonCode();
        final String unrepliableReason = comment.getUnrepliableReason();
        final boolean b19 = m != null && (boolean)m.invoke((Object)comment);
        yo0.a a3;
        if (l10 != null) {
            a3 = (yo0.a)l10.invoke((Object)comment);
        }
        else {
            a3 = null;
        }
        return new lm0.h(id, kindWithId, parentKindWithId, depth, bodyHtml, body, author, authorKindWithId, score, h$a, n, linkKindWithId, b3, b4, b5, archived, b12, saved, b13, b14, b15, b, subscribed ^ true, commentSavableStatus, b16, b17, predictionSystemComment ^ true, scoreHidden, l2, (Set)instance, none, createdUtc, s3, s5, s9, s2, b6, subredditId, s7, s8, richTextString, author2, authorKindWithId3, s, x3, chatVotingState, comment, voteState, authorFlairTemplateId, authorFlairBackgroundColor, authorFlairTextColor, authorFlairText, (List)authorFlairRichText, authorKindWithId2, b7, commentAwardsUiModel, list2, j2, b18, b8, b9, (Listable$Type)null, a, (Map)mediaMetadata, b10, x4, c1, align_END, right, b11, a2, collapsedReasonCode, unrepliableReason, a3, comment.getModQueueTriggers(), comment.getModNoteLabel(), b19, 67129344, 134217728, 2883588);
    }
    
    public static final SnoovatarModel L(final zl1.h h) {
        ah2.f.f((Object)h, "<this>");
        return ((dn1.a)h.c().getValue()).b();
    }
    
    public static String L0(final int n) {
        final int n2 = 0;
        String g;
        if (n == 0) {
            g = "Blocking";
        }
        else if (n == 1) {
            g = "Optional";
        }
        else {
            int n3 = n2;
            if (n == 2) {
                n3 = 1;
            }
            if (n3 != 0) {
                g = "Async";
            }
            else {
                g = a.g("Invalid(value=", n, ')');
            }
        }
        return g;
    }
    
    public static final Map M(final n22.h h) {
        if (h != null) {
            final long b = h.c().b;
            final long b2 = h.b();
            final Long a = h.a();
            final String y1 = CollectionsKt___CollectionsKt.y1((Iterable)ah2.c.Y(new Object[] { String.valueOf(b), String.valueOf(a), String.valueOf(b2), 1, 0 }), (CharSequence)"-", (String)null, (String)null, (l)null, 62);
            final int n = (int)(System.currentTimeMillis() / 1000L);
            final byte[] decode = Base64.decode("eaba29b9540c416ca9094e89db34920c", 10);
            final ByteBuffer allocate = ByteBuffer.allocate(3);
            final ByteOrder little_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            final byte[] array = allocate.order(little_ENDIAN).putChar((char)1).put((byte)0).array();
            final byte[] array2 = ByteBuffer.allocate(4).order(little_ENDIAN).putInt(n + 60).array();
            ah2.f.e((Object)array, "versionBB");
            ah2.f.e((Object)array2, "expirationBB");
            final byte[] t1 = qg2.j.t1(array, array2);
            final Charset b3 = kj2.a.b;
            final byte[] bytes = y1.getBytes(b3);
            ah2.f.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
            final byte[] a2 = z10.b.a(decode, qg2.j.t1(t1, bytes));
            ah2.f.e((Object)a2, "digest");
            final byte[] encode = Base64.encode(qg2.j.t1(t1, a2), 10);
            ah2.f.e((Object)encode, "result");
            return kotlin.collections.c.P1(new Pair[] { new Pair((Object)"X-Trace", (Object)String.valueOf(b)), new Pair((Object)"X-Span", (Object)String.valueOf(b2)), new Pair((Object)"X-Parent", (Object)String.valueOf(a)), new Pair((Object)"X-Sampled", (Object)String.valueOf(1)), new Pair((Object)"X-Flags", (Object)String.valueOf(0)), new Pair((Object)"X-Trace-Hmac", (Object)new String(encode, b3)) });
        }
        return kotlin.collections.c.N1();
    }
    
    public static final String M0(float n) {
        final int max = Math.max(1, 0);
        final float n2 = (float)Math.pow(10.0f, max);
        n *= n2;
        int n4;
        final int n3 = n4 = (int)n;
        if (n - n3 >= 0.5f) {
            n4 = n3 + 1;
        }
        n = n4 / n2;
        String s;
        if (max > 0) {
            s = String.valueOf(n);
        }
        else {
            s = String.valueOf((int)n);
        }
        return s;
    }
    
    public static final dn1.a N(final zl1.h h) {
        ah2.f.f((Object)h, "<this>");
        return (dn1.a)h.c().getValue();
    }
    
    public static v61.a N0(final Subreddit subreddit) {
        ah2.f.f((Object)subreddit, "<this>");
        final String displayNamePrefixed = subreddit.getDisplayNamePrefixed();
        final String e = z10.w.e(subreddit.getId(), ThingType.SUBREDDIT);
        final String communityIcon = subreddit.getCommunityIcon();
        final String subredditType = subreddit.getSubredditType();
        final String primaryColor = subreddit.getPrimaryColor();
        final String submitType = subreddit.getSubmitType();
        final Boolean allowImages = subreddit.getAllowImages();
        final Boolean allowVideos = subreddit.getAllowVideos();
        final Boolean allowGifs = subreddit.getAllowGifs();
        final Boolean over18 = subreddit.getOver18();
        boolean booleanValue = false;
        final boolean b = over18 != null && over18;
        final Boolean allowChatPostCreation = subreddit.getAllowChatPostCreation();
        final boolean b2 = allowChatPostCreation != null && allowChatPostCreation;
        final Boolean chatPostFeatureEnabled = subreddit.isChatPostFeatureEnabled();
        final boolean b3 = chatPostFeatureEnabled != null && chatPostFeatureEnabled;
        final Boolean userIsModerator = subreddit.getUserIsModerator();
        if (userIsModerator != null) {
            booleanValue = userIsModerator;
        }
        final Boolean allowPolls = subreddit.getAllowPolls();
        subreddit.getAllowPredictions();
        return new v61.a(displayNamePrefixed, e, communityIcon, subredditType, primaryColor, submitType, allowImages, allowVideos, allowGifs, b, b2, b3, booleanValue, allowPolls);
    }
    
    public static final Class O(final hh2.d d) {
        ah2.f.f((Object)d, "<this>");
        final Class e = ((ah2.a)d).e();
        ah2.f.d((Object)e, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return e;
    }
    
    public static v61.a O0(final UserSubreddit userSubreddit) {
        final String displayNamePrefixed = userSubreddit.getDisplayNamePrefixed();
        final String kindWithId = userSubreddit.getKindWithId();
        final String iconImg = userSubreddit.getIconImg();
        final String subredditType = userSubreddit.getSubredditType();
        final String keyColor = userSubreddit.getKeyColor();
        final boolean over18 = userSubreddit.getOver18();
        final Boolean userIsModerator = userSubreddit.getUserIsModerator();
        return new v61.a(displayNamePrefixed, kindWithId, iconImg, subredditType, keyColor, (String)null, (Boolean)null, (Boolean)null, (Boolean)null, over18, false, false, userIsModerator != null && userIsModerator, (Boolean)null);
    }
    
    public static final Class P(final hh2.d d) {
        ah2.f.f((Object)d, "<this>");
        Serializable e = ((ah2.a)d).e();
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
    
    public static final Object P0(final Object o) {
        v0 v0;
        if (o instanceof v0) {
            v0 = (v0)o;
        }
        else {
            v0 = null;
        }
        Object a = o;
        if (v0 != null) {
            a = v0.a;
            if (a == null) {
                a = o;
            }
        }
        return a;
    }
    
    public static final Class Q(final hh2.d d) {
        ah2.f.f((Object)d, "<this>");
        final Class e = ((ah2.a)d).e();
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
    
    public static final SpannableString Q0(final CharSequence charSequence, final zg2.a a) {
        ah2.f.f((Object)charSequence, "<this>");
        final SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan((Object)new s72.b(a), 0, spannableString.length(), 33);
        return spannableString;
    }
    
    public static Object R(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            final Iterator iterator = iterable.iterator();
            Object next;
            do {
                next = iterator.next();
            } while (iterator.hasNext());
            return next;
        }
        final List list = (List)iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException();
    }
    
    public static final ImageResolution S(final List list, final eo0.a a) {
        ah2.f.f((Object)list, "<this>");
        ah2.f.f((Object)a, "size");
        if (!list.isEmpty()) {
            final ArrayList list2 = new ArrayList();
            for (final Object next : list) {
                final ImageResolution imageResolution = (ImageResolution)next;
                if (imageResolution.getHeight() / 2 > a.b * 1.1 || imageResolution.getWidth() / 2 > a.a * 1.1) {
                    break;
                }
                list2.add(next);
            }
            final ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                while (listIterator.hasPrevious()) {
                    final Object previous = listIterator.previous();
                    final ImageResolution imageResolution2 = (ImageResolution)previous;
                    if (imageResolution2.getHeight() > 0 && imageResolution2.getWidth() > 0) {
                        ImageResolution imageResolution3;
                        if ((imageResolution3 = (ImageResolution)previous) == null) {
                            imageResolution3 = (ImageResolution)CollectionsKt___CollectionsKt.p1(list);
                        }
                        return imageResolution3;
                    }
                }
                final Object previous = null;
                continue;
            }
        }
        throw new IllegalStateException("Can't get a sized preview if no preview sizes are available.");
    }
    
    public static final j1.d T(final j1.d d, final l l) {
        ah2.f.f((Object)d, "<this>");
        ah2.f.f((Object)l, "block");
        return d.f0((j1.d)new BlockGraphicsLayerModifier(l, InspectableValueKt.a));
    }
    
    public static j1.d U(final j1.d d, float n, float n2, float n3, float n4, float n5, float n6, float n7, float n8, l0 a, boolean b, final int n9) {
        if ((n9 & 0x1) != 0x0) {
            n = 1.0f;
        }
        if ((n9 & 0x2) != 0x0) {
            n2 = 1.0f;
        }
        if ((n9 & 0x4) != 0x0) {
            n3 = 1.0f;
        }
        if ((n9 & 0x10) != 0x0) {
            n4 = 0.0f;
        }
        if ((n9 & 0x20) != 0x0) {
            n5 = 0.0f;
        }
        if ((n9 & 0x40) != 0x0) {
            n6 = 0.0f;
        }
        if ((n9 & 0x80) != 0x0) {
            n7 = 0.0f;
        }
        if ((n9 & 0x100) != 0x0) {
            n8 = 0.0f;
        }
        float n10;
        if ((n9 & 0x200) != 0x0) {
            n10 = 8.0f;
        }
        else {
            n10 = 0.0f;
        }
        long b2;
        if ((n9 & 0x400) != 0x0) {
            b2 = q0.b;
        }
        else {
            b2 = 0L;
        }
        if ((n9 & 0x800) != 0x0) {
            a = (l0)f0.a;
        }
        if ((n9 & 0x1000) != 0x0) {
            b = false;
        }
        long a2;
        if ((n9 & 0x4000) != 0x0) {
            a2 = o1.v.a;
        }
        else {
            a2 = 0L;
        }
        long a3;
        if ((n9 & 0x8000) != 0x0) {
            a3 = o1.v.a;
        }
        else {
            a3 = 0L;
        }
        ah2.f.f((Object)d, "$this$graphicsLayer");
        ah2.f.f((Object)a, "shape");
        return d.f0((j1.d)new SimpleGraphicsLayerModifier(n, n2, n3, 0.0f, n4, n5, n6, n7, n8, n10, b2, a, b, (o1.g0)null, a2, a3, InspectableValueKt.a));
    }
    
    public static final boolean V(final kd0.l l, final PowerupsBenefit powerupsBenefit) {
        ah2.f.f((Object)powerupsBenefit, "benefit");
        boolean b = true;
        final PowerupsBenefit powerupsBenefit2 = null;
        final PowerupsBenefit powerupsBenefit3 = null;
        PowerupsBenefit powerupsBenefit4 = powerupsBenefit2;
        if (l != null) {
            final Set j = l.j;
            powerupsBenefit4 = powerupsBenefit2;
            if (j != null) {
                final Iterator iterator = j.iterator();
                Object next;
                do {
                    next = powerupsBenefit3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    next = iterator.next();
                } while (next != powerupsBenefit);
                powerupsBenefit4 = (PowerupsBenefit)next;
            }
        }
        if (powerupsBenefit4 == null) {
            b = false;
        }
        return b;
    }
    
    public static void W(long[] array, final long[] array2, final long[] array3) {
        final long n = array[0];
        final long n2 = array[1];
        final long n3 = (array[2] << 40 ^ n2 >>> 24) & 0xFFFFFFFFFFFL;
        final long n4 = (n2 << 20 ^ n >>> 44) & 0xFFFFFFFFFFFL;
        final long n5 = n & 0xFFFFFFFFFFFL;
        final long n6 = array2[0];
        final long n7 = array2[1];
        final long n8 = (n7 >>> 24 ^ array2[2] << 40) & 0xFFFFFFFFFFFL;
        final long n9 = (n6 >>> 44 ^ n7 << 20) & 0xFFFFFFFFFFFL;
        final long n10 = n6 & 0xFFFFFFFFFFFL;
        array = new long[10];
        X(n5, n10, array, 0);
        X(n3, n8, array, 2);
        final long n11 = n5 ^ n4 ^ n3;
        final long n12 = n10 ^ n9 ^ n8;
        X(n11, n12, array, 4);
        final long n13 = n4 << 1 ^ n3 << 2;
        final long n14 = n9 << 1 ^ n8 << 2;
        X(n5 ^ n13, n10 ^ n14, array, 6);
        X(n11 ^ n13, n12 ^ n14, array, 8);
        final long n15 = array[6];
        final long n16 = array[8] ^ n15;
        final long n17 = array[7];
        final long n18 = array[9] ^ n17;
        final long n19 = array[0];
        final long n20 = array[1];
        final long n21 = n20 ^ n19 ^ array[4];
        final long n22 = n20 ^ array[5];
        final long n23 = array[2];
        final long n24 = n16 << 1 ^ n15 ^ n19 ^ n23 << 4 ^ n23 << 1;
        final long n25 = array[3];
        final long n26 = n21 ^ (n16 ^ n18 << 1 ^ n17) ^ n25 << 4 ^ n25 << 1 ^ n24 >>> 44;
        final long n27 = n22 ^ n18 ^ n26 >>> 44;
        final long n28 = n26 & 0xFFFFFFFFFFFL;
        final long n29 = (n24 & 0xFFFFFFFFFFFL) >>> 1 ^ (n28 & 0x1L) << 43;
        final long n30 = n29 ^ n29 << 1;
        final long n31 = n30 ^ n30 << 2;
        final long n32 = n31 ^ n31 << 4;
        final long n33 = n32 ^ n32 << 8;
        final long n34 = n33 ^ n33 << 16;
        final long n35 = (n34 ^ n34 << 32) & 0xFFFFFFFFFFFL;
        final long n36 = n28 >>> 1 ^ (n27 & 0x1L) << 43 ^ n35 >>> 43;
        final long n37 = n36 ^ n36 << 1;
        final long n38 = n37 ^ n37 << 2;
        final long n39 = n38 ^ n38 << 4;
        final long n40 = n39 ^ n39 << 8;
        final long n41 = n40 ^ n40 << 16;
        final long n42 = (n41 ^ n41 << 32) & 0xFFFFFFFFFFFL;
        final long n43 = n42 >>> 43 ^ n27 >>> 1;
        final long n44 = n43 ^ n43 << 1;
        final long n45 = n44 ^ n44 << 2;
        final long n46 = n45 ^ n45 << 4;
        final long n47 = n46 ^ n46 << 8;
        final long n48 = n47 ^ n47 << 16;
        final long n49 = n48 ^ n48 << 32;
        array3[0] = n19;
        final long n50 = n21 ^ n35 ^ n23;
        array3[1] = n50;
        final long n51 = n22 ^ n42 ^ n35 ^ n25;
        array3[2] = n51;
        final long n52 = n42 ^ n49;
        array3[3] = n52;
        final long n53 = n49 ^ array[2];
        array3[4] = n53;
        final long n54 = array[3];
        array3[5] = n54;
        array3[0] = (n19 ^ n50 << 44);
        array3[1] = (n50 >>> 20 ^ n51 << 24);
        array3[2] = (n51 >>> 40 ^ n52 << 4 ^ n53 << 48);
        array3[3] = (n52 >>> 60 ^ n54 << 28 ^ n53 >>> 16);
        array3[4] = n54 >>> 36;
        array3[5] = 0L;
    }
    
    public static void X(final long n, long n2, final long[] array, final int n3) {
        final long[] array2 = new long[8];
        array2[1] = n2;
        final long n4 = n2 << 1;
        array2[2] = n4;
        final long n5 = n4 ^ n2;
        array2[3] = n5;
        array2[5] = ((array2[4] = n4 << 1) ^ n2);
        array2[7] = ((array2[6] = n5 << 1) ^ n2);
        final int n6 = (int)n;
        final long n7 = array2[n6 & 0x7];
        n2 = array2[n6 >>> 3 & 0x7];
        long n8 = array2[n6 >>> 6 & 0x7] << 6 ^ (n7 ^ n2 << 3);
        n2 = 0L;
        int n9 = 33;
        int n10;
        long n13;
        long n14;
        do {
            final int n11 = (int)(n >>> n9);
            final long n12 = array2[n11 & 0x7] ^ array2[n11 >>> 3 & 0x7] << 3 ^ array2[n11 >>> 6 & 0x7] << 6 ^ array2[n11 >>> 9 & 0x7] << 9;
            n13 = (n8 ^ n12 << n9);
            n14 = (n2 ^ n12 >>> -n9);
            n10 = n9 - 12;
            n8 = n13;
            n2 = n14;
        } while ((n9 = n10) > 0);
        array[n3] = (0xFFFFFFFFFFFL & n13);
        array[n3 + 1] = (n13 >>> 44 ^ n14 << 20);
    }
    
    public static void Y(final long[] array, final long[] array2) {
        yd.a.j1(0, array[0], array2);
        yd.a.j1(2, array[1], array2);
        final int n = (int)array[2] & 0xFF;
        final int n2 = (n | n << 4) & 0xF0F;
        final int n3 = (n2 | n2 << 2) & 0x3333;
        array2[4] = ((long)((n3 | n3 << 1) & 0x5555) & 0xFFFFFFFFL);
    }
    
    public static void Z(final Fragment fragment) {
        if (fragment != null) {
            Object o = fragment;
            while (true) {
                Fragment parentFragment;
                do {
                    parentFragment = ((Fragment)o).getParentFragment();
                    if (parentFragment == null) {
                        final r activity = fragment.getActivity();
                        ye2.a a;
                        if (activity instanceof ye2.a) {
                            a = (ye2.a)activity;
                        }
                        else {
                            if (!(((Activity)activity).getApplication() instanceof ye2.a)) {
                                throw new IllegalArgumentException(String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
                            }
                            a = (ye2.a)((Activity)activity).getApplication();
                        }
                        if (Log.isLoggable("dagger.android.support", 3)) {
                            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), a.getClass().getCanonicalName()));
                        }
                        final dagger.android.a androidInjector = a.androidInjector();
                        kz0.k.K(androidInjector, "%s.androidInjector() returned null", (Class)a.getClass());
                        androidInjector.inject((Object)fragment);
                        return;
                    }
                    o = parentFragment;
                } while (!(parentFragment instanceof ye2.a));
                ye2.a a = (ye2.a)parentFragment;
                continue;
            }
        }
        throw new NullPointerException("fragment");
    }
    
    public static final tg2.c a0(final tg2.c c) {
        ah2.f.f((Object)c, "<this>");
        ContinuationImpl continuationImpl;
        if (c instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl)c;
        }
        else {
            continuationImpl = null;
        }
        tg2.c intercepted = c;
        if (continuationImpl != null) {
            intercepted = continuationImpl.intercepted();
            if (intercepted == null) {
                intercepted = c;
            }
        }
        return intercepted;
    }
    
    public static l0.e b(final float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        long n4;
        if ((n3 & 0x4) != 0x0) {
            n4 = Long.MIN_VALUE;
        }
        else {
            n4 = 0L;
        }
        long n5;
        if ((n3 & 0x8) != 0x0) {
            n5 = Long.MIN_VALUE;
        }
        else {
            n5 = 0L;
        }
        return new l0.e(VectorConvertersKt.a, n, new l0.f(n2), n4, n5, false);
    }
    
    public static final i9.l b0(final lr0.d d, final ImageView imageView) {
        ah2.f.f((Object)imageView, "view");
        final i9.l into = ((com.bumptech.glide.i)d).into(imageView);
        ah2.f.e((Object)into, "into(view)");
        return into;
    }
    
    public static final boolean c0(final float[] array, final float[] array2) {
        ah2.f.f((Object)array, "$this$invertTo");
        ah2.f.f((Object)array2, "other");
        final float n = array[0];
        final float n2 = array[1];
        final float n3 = array[2];
        final float n4 = array[3];
        final float n5 = array[4];
        final float n6 = array[5];
        final float n7 = array[6];
        final float n8 = array[7];
        final float n9 = array[8];
        final float n10 = array[9];
        final float n11 = array[10];
        final float n12 = array[11];
        final float n13 = array[12];
        final float n14 = array[13];
        final float n15 = array[14];
        final float n16 = array[15];
        final float n17 = n * n6 - n2 * n5;
        final float n18 = n * n7 - n3 * n5;
        final float n19 = n * n8 - n4 * n5;
        final float n20 = n2 * n7 - n3 * n6;
        final float n21 = n2 * n8 - n4 * n6;
        final float n22 = n3 * n8 - n4 * n7;
        final float n23 = n9 * n14 - n10 * n13;
        final float n24 = n9 * n15 - n11 * n13;
        final float n25 = n9 * n16 - n12 * n13;
        final float n26 = n10 * n15 - n11 * n14;
        final float n27 = n10 * n16 - n12 * n14;
        final float n28 = n11 * n16 - n12 * n15;
        final float n29 = n22 * n23 + (n20 * n25 + (n19 * n26 + (n17 * n28 - n18 * n27)) - n21 * n24);
        if (n29 == 0.0f) {
            return false;
        }
        final float n30 = 1.0f / n29;
        array2[0] = (n8 * n26 + (n6 * n28 - n7 * n27)) * n30;
        array2[1] = a40.f.e(n4, n26, n3 * n27 + -n2 * n28, n30);
        array2[2] = (n16 * n20 + (n14 * n22 - n15 * n21)) * n30;
        array2[3] = a40.f.e(n12, n20, n11 * n21 + -n10 * n22, n30);
        final float n31 = -n5;
        array2[4] = a40.f.e(n8, n24, n7 * n25 + n31 * n28, n30);
        array2[5] = (n4 * n24 + (n28 * n - n3 * n25)) * n30;
        final float n32 = -n13;
        array2[6] = a40.f.e(n16, n18, n15 * n19 + n32 * n22, n30);
        array2[7] = (n12 * n18 + (n22 * n9 - n11 * n19)) * n30;
        array2[8] = (n8 * n23 + (n5 * n27 - n6 * n25)) * n30;
        array2[9] = a40.f.e(n4, n23, n25 * n2 + -n * n27, n30);
        array2[10] = (n16 * n17 + (n13 * n21 - n14 * n19)) * n30;
        array2[11] = a40.f.e(n12, n17, n19 * n10 + -n9 * n21, n30);
        array2[12] = a40.f.e(n7, n23, n6 * n24 + n31 * n26, n30);
        array2[13] = (n3 * n23 + (n * n26 - n2 * n24)) * n30;
        array2[14] = a40.f.e(n15, n17, n14 * n18 + n32 * n20, n30);
        array2[15] = (n11 * n17 + (n9 * n20 - n10 * n18)) * n30;
        return true;
    }
    
    public static AndroidParagraph d(final String s, final i2.p p8, List instance, int n, final float n2, final u2.b b, final n2.f.a a, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        Object instance2;
        if ((n3 & 0x8) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        else {
            instance2 = null;
        }
        if ((n3 & 0x10) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        ah2.f.f((Object)s, "text");
        ah2.f.f((Object)p8, "style");
        ah2.f.f((Object)instance, "spanStyles");
        ah2.f.f(instance2, "placeholders");
        ah2.f.f((Object)b, "density");
        ah2.f.f((Object)a, "resourceLoader");
        return new AndroidParagraph(new androidx.compose.ui.text.platform.a(p8, new androidx.compose.ui.text.font.c(new n2.e(a), null, 30), b, s, (List)instance, (List)instance2), n, false, c0.b((int)(float)Math.ceil(n2), 0, 13));
    }
    
    public static final boolean d0(final kd0.l l, final PowerupsBenefit powerupsBenefit) {
        ah2.f.f((Object)powerupsBenefit, "benefit");
        boolean b = true;
        if (l != null) {
            final List n = l.n;
            if (n != null) {
                while (true) {
                    for (final Object next : n) {
                        if (((kd0.c)next).f == powerupsBenefit) {
                            final kd0.c c = (kd0.c)next;
                            if (c != null && c.g) {
                                return b;
                            }
                            return false;
                        }
                    }
                    Object next = null;
                    continue;
                }
            }
        }
        b = false;
        return b;
    }
    
    public static AndroidParagraph e(final String s, final i2.p p7, final long n, final u2.b b, final n2.g.a a, final List list, final int n2) {
        final EmptyList instance = EmptyList.INSTANCE;
        ah2.f.f((Object)s, "text");
        ah2.f.f((Object)p7, "style");
        ah2.f.f((Object)b, "density");
        ah2.f.f((Object)a, "fontFamilyResolver");
        ah2.f.f((Object)list, "spanStyles");
        ah2.f.f((Object)instance, "placeholders");
        return new AndroidParagraph(new androidx.compose.ui.text.platform.a(p7, a, b, s, list, (List)instance), n2, false, n);
    }
    
    public static final boolean e0(final String s) {
        final Iterator iterator = u1.a1((Object[])new String[] { "v.redd.it", "vfa.redd.it", "vcf.redd.it" }).iterator();
        int i;
        do {
            final boolean hasNext = iterator.hasNext();
            final int n = 0;
            if (!hasNext) {
                return false;
            }
            final String s2 = (String)iterator.next();
            i = n;
            if (s == null) {
                continue;
            }
            i = n;
            if (!kotlin.text.b.f2((CharSequence)s, (CharSequence)s2, false)) {
                continue;
            }
            i = 1;
        } while (i == 0);
        return true;
    }
    
    public static final long f(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final int d = n1.f.d;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static boolean f0(final String s) {
        ah2.f.f((Object)s, "eventId");
        return kj2.j.e2(s, "$local.", false);
    }
    
    public static final void g(final j1.d d, final z0.d d2, int n) {
        ah2.f.f((Object)d, "modifier");
        d2.A(-72882467);
        final SpacerMeasurePolicy a = SpacerMeasurePolicy.a;
        d2.A(-1323940314);
        final u2.b b = (u2.b)d2.t(CompositionLocalsKt.e);
        final LayoutDirection layoutDirection = (LayoutDirection)d2.t(CompositionLocalsKt.k);
        final k1 k1 = (k1)d2.t(CompositionLocalsKt.o);
        ComposeUiNode.w2.getClass();
        final zg2.a b2 = ComposeUiNode$Companion.b;
        final ComposableLambdaImpl b3 = LayoutKt.b(d);
        n = ((((n << 3 & 0x70) | 0x180) << 9 & 0x1C00) | 0x6);
        if (d2.s() instanceof z0.c) {
            d2.h();
            if (d2.q()) {
                d2.i((zg2.a<?>)b2);
            }
            else {
                d2.e();
            }
            d2.E();
            Updater.b(d2, (Object)a, ComposeUiNode$Companion.e);
            Updater.b(d2, (Object)b, ComposeUiNode$Companion.d);
            Updater.b(d2, (Object)layoutDirection, ComposeUiNode$Companion.f);
            b3.invoke((Object)s0.t(d2, k1, ComposeUiNode$Companion.g, d2), (Object)d2, (Object)(n >> 3 & 0x70));
            d2.A(2058660585);
            d2.A(1142320198);
            if ((n >> 9 & 0xE & 0xB) == 0x2) {
                if (d2.b()) {
                    d2.j();
                }
            }
            a2.b.w(d2);
            return;
        }
        yl.a.B0();
        throw null;
    }
    
    public static final boolean g0(final z0.d d) {
        return (((Configuration)d.t(AndroidCompositionLocals_androidKt.a)).uiMode & 0x30) == 0x20;
    }
    
    public static final void h(final Context context, final com.instabug.bug.model.a a) {
        ah2.f.f((Object)a, "bug");
        ah2.f.f((Object)context, "context");
        try {
            v(a);
            r(context, a);
        }
        catch (final Exception ex) {
            InstabugCore.reportError((Throwable)ex, ah2.f.l((Object)a.getId(), "couldn't delete Bug "));
        }
    }
    
    public static ph2.c h0(final a a, final li2.c c, final kotlin.reflect.jvm.internal.impl.builtins.c c2) {
        a.getClass();
        ah2.f.f((Object)c2, "builtIns");
        final String a2 = oh2.c.a;
        final li2.b f = oh2.c.f(c);
        ph2.c j;
        if (f != null) {
            j = c2.j(f.b());
        }
        else {
            j = null;
        }
        return j;
    }
    
    public static final void i(final Attachment attachment, final String s) {
        ah2.f.f((Object)attachment, "attachment");
        final String localPath = attachment.getLocalPath();
        if (localPath != null) {
            if (new File(localPath).delete()) {
                InstabugSDKLogger.v("IBG-BR", "uploadingBugAttachmentRequest succeeded, attachment file deleted successfully");
            }
            final pg2.j a = pg2.j.a;
        }
        if (attachment.getId() != -1L) {
            AttachmentsDbHelper.delete(attachment.getId());
        }
        else if (attachment.getName() != null && s != null) {
            AttachmentsDbHelper.delete(attachment.getName(), s);
        }
    }
    
    public static final boolean i0(final StorefrontListing storefrontListing, final we0.b b) {
        ah2.f.f((Object)storefrontListing, "<this>");
        ah2.f.f((Object)b, "filter");
        final boolean b2 = b instanceof b$c;
        float n = Float.MAX_VALUE;
        final float n2 = Float.MIN_VALUE;
        float n3 = Float.MIN_VALUE;
        float n4;
        if (b2) {
            final b$c b$c = (b$c)b;
            final Float a = b$c.a;
            if (a != null) {
                n3 = a;
            }
            final Float b3 = b$c.b;
            if (b3 != null) {
                n = b3;
            }
            n4 = storefrontListing.i.c;
        }
        else {
            if (!(b instanceof b$a)) {
                throw new NoWhenBranchMatchedException();
            }
            final b$a b$a = (b$a)b;
            final b$b a2 = b$a.a;
            n3 = n2;
            if (a2 != null) {
                n3 = a2.a;
            }
            final b$b b4 = b$a.b;
            if (b4 != null) {
                n = b4.a;
            }
            n4 = storefrontListing.j.b;
        }
        return n4 > n3 && n4 <= n;
    }
    
    public static final long j(final float n, final boolean b) {
        final long n2 = Float.floatToIntBits(n);
        long n3;
        if (b) {
            n3 = 1L;
        }
        else {
            n3 = 0L;
        }
        return (n3 & 0xFFFFFFFFL) | n2 << 32;
    }
    
    public static final eo0.a j0(final int n, final List list) {
        final int n2 = n * 9 / 16;
        int n5;
        int n6;
        if (list != null) {
            final Iterator iterator = list.iterator();
            int n3 = n;
            int n4 = n2;
            while (true) {
                n5 = n3;
                n6 = n4;
                if (!iterator.hasNext()) {
                    break;
                }
                final ImageResolution imageResolution = (ImageResolution)iterator.next();
                int width = imageResolution.getWidth();
                if (width > n3) {
                    width = n3;
                }
                if ((n3 = width) < n) {
                    n3 = n;
                }
                final int height = imageResolution.getHeight();
                if (height < n4) {
                    continue;
                }
                n4 = height;
            }
        }
        else {
            n5 = n;
            n6 = n2;
        }
        return new eo0.a(n, Math.min((int)Math.ceil(n / n5 * n6 * 1.0), n2));
    }
    
    public static final b22.a k(final Controller controller) {
        final Activity xa = controller.XA();
        ah2.f.d((Object)xa, "null cannot be cast to non-null type com.reddit.themes.RedditThemedActivity");
        return ((RedditThemedActivity)xa).g0();
    }
    
    public static final String k0(final pw0.c c, final d22.d d) {
        ah2.f.f((Object)d, "dateFormatterDelegate");
        final OffsetDateTime k = c.k;
        String a;
        if (k != null) {
            a = d$a.a(d, k.toEpochSecond() * 1000, false, 6);
        }
        else {
            a = null;
        }
        return a;
    }
    
    public static final void l(final ImageButton imageButton, final float n) {
        final Drawable background = ((View)imageButton).getBackground();
        final boolean b = background instanceof RippleDrawable;
        GradientDrawable gradientDrawable = null;
        Object o;
        if (b) {
            o = background;
        }
        else {
            o = null;
        }
        Object drawableByLayerId;
        if (o != null) {
            drawableByLayerId = ((LayerDrawable)o).findDrawableByLayerId(2131428308);
        }
        else {
            drawableByLayerId = null;
        }
        if (drawableByLayerId instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable)drawableByLayerId;
        }
        if (gradientDrawable != null) {
            gradientDrawable.setAlpha(at1.a.D1(255 * n));
        }
    }
    
    public static void l0(final long[] array, final long[] array2, final long[] array3) {
        final long[] array4 = new long[6];
        W(array, array2, array4);
        u0(array4, array3);
    }
    
    public static final SnoovatarAnalytics$SortFilter m(final um1.f f) {
        SnoovatarAnalytics$SortFilter snoovatarAnalytics$SortFilter;
        if (f.a((Object)f, (Object)f$a.f)) {
            snoovatarAnalytics$SortFilter = SnoovatarAnalytics$SortFilter.All;
        }
        else if (f.a((Object)f, (Object)f$c.f)) {
            snoovatarAnalytics$SortFilter = SnoovatarAnalytics$SortFilter.Featured;
        }
        else if (f.a((Object)f, (Object)f$e.f)) {
            snoovatarAnalytics$SortFilter = SnoovatarAnalytics$SortFilter.Popular;
        }
        else if (f.a((Object)f, (Object)f$b.f)) {
            snoovatarAnalytics$SortFilter = SnoovatarAnalytics$SortFilter.Available;
        }
        else {
            if (!(f instanceof f$d)) {
                throw new NoWhenBranchMatchedException();
            }
            snoovatarAnalytics$SortFilter = SnoovatarAnalytics$SortFilter.All;
        }
        return snoovatarAnalytics$SortFilter;
    }
    
    public static final z0.l0 m0(final Object o, final a1 a1) {
        ah2.f.f((Object)a1, "policy");
        final pg2.f a2 = ActualAndroid_androidKt.a;
        return new z0.l0(o, a1);
    }
    
    public static final ArrayList n(final String s, final List list) {
        final ArrayList list2 = new ArrayList(qg2.m.P0((Iterable)list, 10));
        for (RecapCardUiModel$m recapCardUiModel$m2 : list) {
            final RecapCardUiModel$m recapCardUiModel$m = recapCardUiModel$m2;
            if (ah2.f.a((Object)recapCardUiModel$m.b, (Object)s)) {
                final boolean c = recapCardUiModel$m.c;
                final String a = recapCardUiModel$m.a;
                final String b = recapCardUiModel$m.b;
                ah2.f.f((Object)a, "id");
                ah2.f.f((Object)b, "name");
                recapCardUiModel$m2 = new RecapCardUiModel$m(a, b, c ^ true);
            }
            list2.add(recapCardUiModel$m2);
        }
        return list2;
    }
    
    public static /* synthetic */ z0.l0 n0(final Object o) {
        return m0(o, (a1)z0.h1.a);
    }
    
    public static void o(final CollapseTree collapseTree, final ArrayList list, ReplyableTreeNode replyableTreeNode) {
        collapseTree.pushChildren(replyableTreeNode, (List)list);
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            replyableTreeNode = (ReplyableTreeNode)iterator.next();
            final Replyable replyable = (Replyable)replyableTreeNode.getData().getData();
            if (replyable.getReplies() != null) {
                final List<ReplyableWrapper> children = replyable.getReplies().getData().getChildren();
                final ArrayList<ReplyableTreeNode> list2 = new ArrayList<ReplyableTreeNode>();
                final int level = replyableTreeNode.getLevel();
                for (final ReplyableWrapper replyableWrapper : children) {
                    final ReplyableTreeNode replyableTreeNode2 = new ReplyableTreeNode((ReplyableWrapper)replyableWrapper, level + 1);
                    if (replyableWrapper instanceof MoreWrapper) {
                        if (((More)((ThingWrapper<Thing>)replyableWrapper).getData()).getCount() <= 0) {
                            continue;
                        }
                        replyableTreeNode2.setExpanded(false);
                    }
                    list2.add(replyableTreeNode2);
                }
                o(collapseTree, list2, replyableTreeNode);
                replyable.setReplies(null);
            }
        }
    }
    
    public static final void o0(final zg2.a a, final l l, final l i) {
        final c1 a2 = b1.a;
        final b1.c c = (b1.c)a2.e();
        try {
            Object g;
            if ((g = a2.e()) == null) {
                g = c1.h.g;
            }
            a2.h(((b1.c<Pair>)g).add(new Pair((Object)l, (Object)i)));
            a.invoke();
            a2.h(c);
        }
        finally {
            b1.a.h(c);
        }
    }
    
    public static void p(final long[] array, final long[] array2, final long[] array3) {
        array3[0] = (array[0] ^ array2[0]);
        array3[1] = (array[1] ^ array2[1]);
        array3[2] = (array[2] ^ array2[2]);
        array3[3] = (array[3] ^ array2[3]);
        array3[4] = (array2[4] ^ array[4]);
    }
    
    public static j1.d p0(final j1.d d, final Painter painter, j1.a e, c2.c e2, float n, s s, final int n2) {
        final boolean b = (n2 & 0x2) != 0x0;
        if ((n2 & 0x4) != 0x0) {
            e = (j1.a)j1.a$a.e;
        }
        if ((n2 & 0x8) != 0x0) {
            e2 = c2.c.a.e;
        }
        if ((n2 & 0x10) != 0x0) {
            n = 1.0f;
        }
        if ((n2 & 0x20) != 0x0) {
            s = null;
        }
        ah2.f.f((Object)d, "<this>");
        ah2.f.f((Object)painter, "painter");
        ah2.f.f((Object)e, "alignment");
        ah2.f.f((Object)e2, "contentScale");
        return d.f0((j1.d)new PainterModifier(painter, b, e, e2, n, s, InspectableValueKt.a));
    }
    
    public static void q(final View view, final l l, final l i) {
        if (l.invoke((Object)view)) {
            i.invoke((Object)view);
        }
        else {
            view.animate().alpha(0.0f).setDuration(150L).withEndAction((Runnable)new d0(i, view, 150L)).start();
        }
    }
    
    public static final Painter q0(int n, final z0.d d) {
        d.A(473971343);
        final Context context = (Context)d.t(AndroidCompositionLocals_androidKt.b);
        final Resources resources = context.getResources();
        d.A(-492369756);
        final Object b = d.B();
        final d$a$a a = z0.d$a.a;
        Object o = b;
        if (b == a) {
            o = new TypedValue();
            d.v(o);
        }
        d.I();
        final TypedValue typedValue = (TypedValue)o;
        resources.getValue(n, typedValue, true);
        final CharSequence string = typedValue.string;
        g2.b$a b$a = null;
        Label_2072: {
            if (string != null && kotlin.text.b.i2(string, ".xml")) {
                d.A(-738265321);
                final Resources$Theme theme = context.getTheme();
                ah2.f.e((Object)theme, "context.theme");
                d.A(2112503116);
                final g2.b b2 = (g2.b)d.t(AndroidCompositionLocals_androidKt.c);
                final g2.b$b b$b = new g2.b$b(n, theme);
                b2.getClass();
                final WeakReference weakReference = b2.a.get(b$b);
                if (weakReference != null) {
                    b$a = (g2.b$a)weakReference.get();
                }
                g2.b$a b$a2;
                if ((b$a2 = b$a) == null) {
                    final XmlResourceParser xml = resources.getXml(n);
                    ah2.f.e((Object)xml, "res.getXml(id)");
                    for (n = ((XmlPullParser)xml).next(); n != 2 && n != 1; n = ((XmlPullParser)xml).next()) {}
                    if (n != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!ah2.f.a((Object)((XmlPullParser)xml).getName(), (Object)"vector")) {
                        throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                    }
                    final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                    final t1.a a2 = new t1.a(xml);
                    ah2.f.e((Object)attributeSet, "attrs");
                    final TypedArray e = a2.e(resources, theme, attributeSet, c0.e);
                    final boolean b3 = p3.k.g((XmlPullParser)xml, "autoMirrored") && e.getBoolean(5, false);
                    a2.f(e.getChangingConfigurations());
                    final float b4 = a2.b(e, "viewportWidth", 7, 0.0f);
                    final float b5 = a2.b(e, "viewportHeight", 8, 0.0f);
                    if (b4 <= 0.0f) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(e.getPositionDescription());
                        sb.append("<VectorGraphic> tag requires viewportWidth > 0");
                        throw new XmlPullParserException(sb.toString());
                    }
                    if (b5 <= 0.0f) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(e.getPositionDescription());
                        sb2.append("<VectorGraphic> tag requires viewportHeight > 0");
                        throw new XmlPullParserException(sb2.toString());
                    }
                    final float dimension = e.getDimension(3, 0.0f);
                    a2.f(e.getChangingConfigurations());
                    final float dimension2 = e.getDimension(2, 0.0f);
                    a2.f(e.getChangingConfigurations());
                    long n2;
                    if (e.hasValue(1)) {
                        final TypedValue typedValue2 = new TypedValue();
                        e.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            n2 = o1.r.l;
                        }
                        else {
                            final ColorStateList b6 = p3.k.b(e, (XmlPullParser)xml, theme);
                            a2.f(e.getChangingConfigurations());
                            if (b6 != null) {
                                n2 = at1.a.e(b6.getDefaultColor());
                            }
                            else {
                                n2 = o1.r.l;
                            }
                        }
                    }
                    else {
                        n2 = o1.r.l;
                    }
                    n = e.getInt(6, -1);
                    a2.f(e.getChangingConfigurations());
                    Label_0662: {
                        if (n != -1) {
                            if (n == 3) {
                                n = 3;
                                break Label_0662;
                            }
                            if (n != 5) {
                                if (n == 9) {
                                    n = 9;
                                    break Label_0662;
                                }
                                switch (n) {
                                    case 16: {
                                        n = 12;
                                        break Label_0662;
                                    }
                                    case 15: {
                                        n = 14;
                                        break Label_0662;
                                    }
                                    case 14: {
                                        n = 13;
                                        break Label_0662;
                                    }
                                }
                            }
                        }
                        n = 5;
                    }
                    final float n3 = dimension / resources.getDisplayMetrics().density;
                    final float n4 = dimension2 / resources.getDisplayMetrics().density;
                    e.recycle();
                    final s1.c.a a3 = new s1.c.a(n3, n4, b4, b5, n2, n, b3);
                    n = 0;
                    final g2.b$b b$b2 = b$b;
                    while (((XmlPullParser)xml).getEventType() != 1 && (((XmlPullParser)xml).getDepth() >= 1 || ((XmlPullParser)xml).getEventType() != 3)) {
                        final int eventType = a2.a.getEventType();
                        if (eventType != 2) {
                            if (eventType == 3) {
                                if (ah2.f.a((Object)"group", (Object)a2.a.getName())) {
                                    for (int i = 0; i < n + 1; ++i) {
                                        a3.b();
                                    }
                                    n = 0;
                                }
                            }
                        }
                        else {
                            final String name = a2.a.getName();
                            if (name != null) {
                                final int hashCode = name.hashCode();
                                if (hashCode != -1649314686) {
                                    if (hashCode != 3433509) {
                                        if (hashCode == 98629247) {
                                            if (name.equals("group")) {
                                                final TypedArray e2 = a2.e(resources, theme, attributeSet, c0.f);
                                                final float b7 = a2.b(e2, "rotation", 5, 0.0f);
                                                final float float1 = e2.getFloat(1, 0.0f);
                                                a2.f(e2.getChangingConfigurations());
                                                final float float2 = e2.getFloat(2, 0.0f);
                                                a2.f(e2.getChangingConfigurations());
                                                final float b8 = a2.b(e2, "scaleX", 3, 1.0f);
                                                final float b9 = a2.b(e2, "scaleY", 4, 1.0f);
                                                final float b10 = a2.b(e2, "translateX", 6, 0.0f);
                                                final float b11 = a2.b(e2, "translateY", 7, 0.0f);
                                                String d2 = a2.d(e2, 0);
                                                if (d2 == null) {
                                                    d2 = "";
                                                }
                                                e2.recycle();
                                                a3.a(d2, b7, float1, float2, b8, b9, b10, b11, (List)s1.j.a);
                                            }
                                        }
                                    }
                                    else if (name.equals("path")) {
                                        final TypedArray e3 = a2.e(resources, theme, attributeSet, c0.g);
                                        if (!p3.k.g(a2.a, "pathData")) {
                                            throw new IllegalArgumentException("No path data available");
                                        }
                                        String d3 = a2.d(e3, 0);
                                        if (d3 == null) {
                                            d3 = "";
                                        }
                                        final List<s1.d> a4 = s1.j.a(a2.d(e3, 2));
                                        final p3.c a5 = a2.a(e3, theme, "fillColor", 1);
                                        final float b12 = a2.b(e3, "fillAlpha", 12, 1.0f);
                                        final int c = a2.c(e3, "strokeLineCap", 8, -1);
                                        int n5 = 0;
                                        Label_1246: {
                                            if (c != 0) {
                                                if (c == 1) {
                                                    n5 = 1;
                                                    break Label_1246;
                                                }
                                                if (c == 2) {
                                                    n5 = 2;
                                                    break Label_1246;
                                                }
                                            }
                                            n5 = 0;
                                        }
                                        final int c2 = a2.c(e3, "strokeLineJoin", 9, -1);
                                        int n6;
                                        if (c2 != 0) {
                                            if (c2 != 1) {
                                                n6 = 2;
                                            }
                                            else {
                                                n6 = 1;
                                            }
                                        }
                                        else {
                                            n6 = 0;
                                        }
                                        final float b13 = a2.b(e3, "strokeMiterLimit", 10, 1.0f);
                                        final p3.c a6 = a2.a(e3, theme, "strokeColor", 3);
                                        final float b14 = a2.b(e3, "strokeAlpha", 11, 1.0f);
                                        final float b15 = a2.b(e3, "strokeWidth", 4, 1.0f);
                                        final float b16 = a2.b(e3, "trimPathEnd", 6, 1.0f);
                                        final float b17 = a2.b(e3, "trimPathOffset", 7, 0.0f);
                                        final float b18 = a2.b(e3, "trimPathStart", 5, 0.0f);
                                        final int c3 = a2.c(e3, "fillType", 13, 0);
                                        e3.recycle();
                                        final n l = p2.e.l(a5);
                                        final n j = p2.e.l(a6);
                                        int n7;
                                        if (c3 == 0) {
                                            n7 = 0;
                                        }
                                        else {
                                            n7 = 1;
                                        }
                                        ah2.f.f((Object)a4, "pathData");
                                        a3.c();
                                        final ArrayList<s1.c.a.a> k = a3.i;
                                        ((s1.c.a.a)k.get(k.size() - 1)).j.add((s1.k)new s1.l(d3, (List)a4, n7, l, b12, j, b14, b15, n5, n6, b13, b18, b16, b17));
                                    }
                                }
                                else if (name.equals("clip-path")) {
                                    final TypedArray e4 = a2.e(resources, theme, attributeSet, c0.h);
                                    String d4 = a2.d(e4, 0);
                                    if (d4 == null) {
                                        d4 = "";
                                    }
                                    final List<s1.d> a7 = s1.j.a(a2.d(e4, 1));
                                    e4.recycle();
                                    a3.a(d4, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a7);
                                    ++n;
                                }
                            }
                        }
                        ((XmlPullParser)xml).next();
                    }
                    a3.c();
                    while (a3.i.size() > 1) {
                        a3.b();
                    }
                    final String a8 = a3.a;
                    final float b19 = a3.b;
                    final float c4 = a3.c;
                    final float d5 = a3.d;
                    final float e5 = a3.e;
                    final s1.c.a.a m = a3.j;
                    final s1.c c5 = new s1.c(a8, b19, c4, d5, e5, new s1.i(m.a, m.b, m.c, m.d, m.e, m.f, m.g, m.h, (List)m.i, (List)m.j), a3.f, a3.g, a3.h);
                    a3.k = true;
                    b$a2 = new g2.b$a(c5, a2.b);
                    b2.a.put(b$b2, new WeakReference(b$a2));
                }
                final s1.c a9 = b$a2.a;
                d.I();
                final Object b20 = VectorPainterKt.b(a9, d);
                d.I();
                break Label_2072;
            }
            d.A(-738265196);
            d.A(511388516);
            final boolean l2 = d.l(string);
            final boolean l3 = d.l(n);
            final Object b21 = d.B();
            Label_2046: {
                if (!(l3 | l2)) {
                    final Object p2;
                    if ((p2 = b21) != a) {
                        break Label_2046;
                    }
                }
                try {
                    final Object p2 = at1.a.P0(resources, n);
                    d.v(p2);
                    d.I();
                    final Object b20 = new r1.a((o1.w)p2);
                    d.I();
                    d.I();
                    return (Painter)b20;
                }
                finally {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
            }
        }
    }
    
    public static final void r(final Context context, final com.instabug.bug.model.a a) {
        ah2.f.f((Object)a, "<this>");
        ah2.f.f((Object)context, "context");
        final State state = ((BaseReport)a).getState();
        pg2.j a2 = null;
        Label_0097: {
            if (state != null) {
                if (state.getUri() != null) {
                    InstabugSDKLogger.v("IBG-BR", ah2.f.l((Object)a.getId(), "attempting to delete state file for bug with id: "));
                    final DiskUtils with = DiskUtils.with(context);
                    final State state2 = ((BaseReport)a).getState();
                    ah2.f.c((Object)state2);
                    with.deleteOperation((DiskOperation)new DeleteUriDiskOperation(state2.getUri())).executeAsync((DiskOperationCallback)new bm.a(a));
                    a2 = pg2.j.a;
                    break Label_0097;
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            InstabugSDKLogger.i("IBG-BR", "No state file found. deleting the bug");
            if (a.getId() != null) {
                ((ql.b)mk2.e.h()).a(a.getId());
            }
            ((AbstractEventPublisher)ReportUploadingStateEventBus.INSTANCE).post((Object)1);
        }
    }
    
    public static final PostingInOnboardingVariant r0(final db0.t t) {
        ah2.f.f((Object)t, "<this>");
        PostingInOnboardingVariant a7 = t.a7();
        if (a7 == PostingInOnboardingVariant.Control1) {
            a7 = null;
        }
        PostingInOnboardingVariant d8 = a7;
        if (a7 == null) {
            d8 = t.d8();
        }
        return d8;
    }
    
    public static void s(final Context context, final bj2.d d, final h91.b b) {
        ah2.f.f((Object)b, "icon");
        if (b instanceof h91.h) {
            final h91.h h = (h91.h)b;
            if (h instanceof h$b) {
                d.T((h$b)b);
            }
            else {
                if (!(h instanceof h91.h$a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((h91.d)d).n();
                final h91.h$a h$a = (h91.h$a)b;
                final InsetDrawable insetDrawable = new InsetDrawable(ah2.c.C0(context, 2131231955, -1), context.getResources().getDimensionPixelSize(2131165836));
                final GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                final Integer h2 = h$a.h;
                int color;
                if (h2 != null) {
                    color = h2;
                }
                else {
                    color = ah2.c.D(((h91.h)h$a).g, context);
                }
                gradientDrawable.setColor(color);
                final pg2.j a = pg2.j.a;
                ((h91.d)d).p(new LayerDrawable(new Drawable[] { (Drawable)gradientDrawable, (Drawable)insetDrawable }));
            }
            final pg2.j a2 = pg2.j.a;
        }
        else if (b instanceof h91.i) {
            final h91.i i = (h91.i)b;
            if (i instanceof i$c) {
                d.U((i$c)b);
            }
            else if (i instanceof i$b) {
                ((h91.d)d).v((i$b)b);
            }
            else {
                if (!(i instanceof i$a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((h91.d)d).n();
                ((h91.d)d).p((LayerDrawable)i.a(context));
            }
            final pg2.j a3 = pg2.j.a;
        }
        else {
            if (!(b instanceof h91.g)) {
                throw new NoWhenBranchMatchedException();
            }
            d.S((h91.g)b);
        }
        final pg2.j a4 = pg2.j.a;
    }
    
    public static final LinkedHashMap s0(final String s, final n22.p p3, final String s2) {
        ah2.f.f((Object)s, "correlationId");
        ah2.f.f((Object)p3, "trackingDelegate");
        final TrackerParams c = p3.c(s);
        n22.h c2 = null;
        final n22.h h = null;
        Map map;
        if (s2 != null) {
            n22.h h2 = h;
            if (c != null) {
                final LinkedHashMap e = c.e;
                h2 = h;
                if (e != null) {
                    h2 = (n22.h)e.get(s2);
                }
            }
            map = M(h2);
        }
        else {
            if (c != null) {
                c2 = c.c;
            }
            map = M(c2);
        }
        return kotlin.collections.c.T1(u1.B0(new Pair((Object)"correlationId", (Object)s)), map);
    }
    
    public static void t(final ImageView imageView, final h91.b b) {
        ah2.f.f((Object)imageView, "imageView");
        ah2.f.f((Object)b, "icon");
        final Context context = ((View)imageView).getContext();
        ah2.f.e((Object)context, "imageView.context");
        s(context, (bj2.d)new h91.f(imageView), b);
    }
    
    public static final void t0(final lr0.d d, final boolean b, final boolean b2) {
        ah2.f.f((Object)d, "<this>");
        if (b) {
            if (b2) {
                d.i().g((r8.f)r8.f.c);
            }
        }
        else {
            d.c((h9.a)ng.f0.n2());
        }
    }
    
    public static void u(final AvatarView avatarView, final h91.b b) {
        ah2.f.f((Object)avatarView, "avatarView");
        ah2.f.f((Object)b, "icon");
        final Context context = ((View)avatarView).getContext();
        ah2.f.e((Object)context, "avatarView.context");
        s(context, (bj2.d)new h91.a(avatarView), b);
    }
    
    public static void u0(final long[] array, final long[] array2) {
        final long n = array[0];
        final long n2 = array[1];
        final long n3 = array[2];
        final long n4 = array[3];
        final long n5 = array[4];
        final long n6 = n4 ^ n5 >>> 59;
        final long n7 = n3 ^ (n5 >>> 3 ^ n5 >>> 1 ^ n5 ^ n5 << 5) ^ n6 >>> 59;
        final long n8 = n7 >>> 3;
        array2[0] = (n ^ (n6 << 61 ^ n6 << 63) ^ n8 ^ n8 << 2 ^ n8 << 3 ^ n8 << 8);
        array2[1] = (n8 >>> 56 ^ (n2 ^ (n5 << 61 ^ n5 << 63) ^ (n6 >>> 3 ^ n6 >>> 1 ^ n6 ^ n6 << 5)));
        array2[2] = (0x7L & n7);
    }
    
    public static final void v(final com.instabug.bug.model.a a) {
        final List a2 = a.a();
        if (a2 != null) {
            final ArrayList list = new ArrayList();
            for (final Object next : a2) {
                if (((Attachment)next).getLocalPath() != null) {
                    list.add(next);
                }
            }
            for (final Attachment attachment : list) {
                ah2.f.e((Object)attachment, "it");
                i(attachment, a.getId());
            }
        }
    }
    
    public static final h0 v0(final Object value, final z0.d d) {
        Object o;
        if ((o = ak0.m.i(d, -1058319986, -492369756)) == z0.d$a.a) {
            o = n0(value);
            d.v(o);
        }
        d.I();
        final h0 h0 = (h0)o;
        h0.setValue(value);
        d.I();
        return h0;
    }
    
    public static void w(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static final void w0(final String s) {
        final PrintStream err = System.err;
        final StringBuilder sb = new StringBuilder();
        sb.append("SLF4J: ");
        sb.append(s);
        err.println(sb.toString());
    }
    
    public static final h0 x(final y y, final z0.d d) {
        ah2.f.f((Object)y, "<this>");
        d.A(-1439883919);
        final h0 a = androidx.compose.runtime.e.a((pj2.e)y, y.getValue(), (CoroutineContext)EmptyCoroutineContext.INSTANCE, d, 520, 0);
        d.I();
        return a;
    }
    
    public static final void x0(final String s, final Throwable t) {
        System.err.println(s);
        System.err.println("Reported exception:");
        t.printStackTrace();
    }
    
    public static ph2.c y(final ph2.c c) {
        final li2.d g = ni2.d.g((ph2.g)c);
        final String a = oh2.c.a;
        final li2.c c2 = oh2.c.k.get(g);
        if (c2 != null) {
            return DescriptorUtilsKt.e((ph2.g)c).j(c2);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Given class ");
        sb.append(c);
        sb.append(" is not a ");
        sb.append("read-only");
        sb.append(" collection");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final void y0(final Handler handler, final Runnable runnable) {
        ah2.f.f((Object)handler, "<this>");
        if (ah2.f.a((Object)Thread.currentThread(), (Object)handler.getLooper().getThread())) {
            runnable.run();
        }
        else {
            handler.post(runnable);
        }
    }
    
    public static l0.e z(final l0.e e) {
        final float a = ((l0.f)e.h).a;
        final long i = e.i;
        final long j = e.j;
        final boolean k = e.k;
        ah2.f.f((Object)e, "<this>");
        return new l0.e((g0<Object, i>)e.f, 0.0f, new l0.f(a), i, j, k);
    }
    
    public static final void z0(final RedditButton redditButton, final boolean b, final boolean b2) {
        int text;
        if (b) {
            text = 2131957427;
        }
        else {
            text = 2131957428;
        }
        ((TextView)redditButton).setText(text);
        if (b2) {
            redditButton.setButtonIcon(n3.a.getDrawable(((View)redditButton).getContext(), 2131231614));
            redditButton.setButtonIconPosition(RedditButton$ButtonIconPosition.END);
            redditButton.setButtonIconSize(Integer.valueOf(((View)redditButton).getResources().getDimensionPixelSize(2131165409)));
        }
        else {
            redditButton.setButtonIcon((Drawable)null);
        }
    }
    
    public String[] a() {
        return a.g;
    }
    
    public Object c(final IBinder binder) {
        final int a = u0.a;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof ig.v0) {
                o = queryLocalInterface;
            }
            else {
                o = new t0(binder);
            }
        }
        return o;
    }
    
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
    
    public Object l1() {
        return new TreeMap();
    }
}
