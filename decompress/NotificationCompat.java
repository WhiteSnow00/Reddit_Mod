// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import m3.h;
import android.app.Notification$Action$Builder;
import android.text.SpannableStringBuilder;
import android.content.res.ColorStateList;
import android.text.style.TextAppearanceSpan;
import java.util.Collection;
import java.util.Collections;
import android.app.Notification$Style;
import android.app.RemoteInput$Builder;
import android.os.SystemClock;
import java.text.NumberFormat;
import android.widget.RemoteViews;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Bitmap$Config;
import android.app.Notification$DecoratedCustomViewStyle;
import android.app.Notification$MessagingStyle;
import android.app.Notification$InboxStyle;
import android.app.Notification$BigTextStyle;
import android.content.res.Resources;
import android.content.Context;
import android.app.Notification$BigPictureStyle;
import android.graphics.Bitmap;
import a4.w;
import a4.o;
import a4.r;
import java.util.Iterator;
import android.os.Parcelable;
import android.content.LocusId;
import android.text.TextUtils;
import androidx.appcompat.widget.z;
import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.List;
import a4.q;
import android.os.Bundle;
import a4.s;
import a4.b1;
import a4.v;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import a4.g1;
import a4.e2;
import a4.w0;
import java.util.Set;
import a4.c2;
import android.os.Build$VERSION;
import android.app.Notification$Action;
import android.app.Notification;

public class NotificationCompat
{
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;
    
    @Deprecated
    public NotificationCompat() {
    }
    
    public static NotificationCompat$Action getAction(final Notification notification, final int n) {
        return getActionCompatFromAction(notification.actions[n]);
    }
    
    public static NotificationCompat$Action getActionCompatFromAction(final Notification$Action notification$Action) {
        final android.app.RemoteInput[] remoteInputs = notification$Action.getRemoteInputs();
        IconCompat a = null;
        boolean c = false;
        RemoteInput[] array;
        if (remoteInputs == null) {
            array = null;
        }
        else {
            array = new RemoteInput[remoteInputs.length];
            for (int i = 0; i < remoteInputs.length; ++i) {
                final android.app.RemoteInput remoteInput = remoteInputs[i];
                final String resultKey = remoteInput.getResultKey();
                final CharSequence label = remoteInput.getLabel();
                final CharSequence[] choices = remoteInput.getChoices();
                final boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                int a2;
                if (Build$VERSION.SDK_INT >= 29) {
                    a2 = c2.a(remoteInput);
                }
                else {
                    a2 = 0;
                }
                array[i] = new RemoteInput(resultKey, label, choices, allowFreeFormInput, a2, remoteInput.getExtras(), null);
            }
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = ((BaseBundle)notification$Action.getExtras()).getBoolean("android.support.allowGeneratedReplies") || notification$Action.getAllowGeneratedReplies();
        final boolean boolean1 = ((BaseBundle)notification$Action.getExtras()).getBoolean("android.support.action.showsUserInterface", true);
        int n;
        if (sdk_INT >= 28) {
            n = w0.a(notification$Action);
        }
        else {
            n = ((BaseBundle)notification$Action.getExtras()).getInt("android.support.action.semanticAction", 0);
        }
        final boolean b2 = sdk_INT >= 29 && e2.i(notification$Action);
        if (sdk_INT >= 31) {
            c = g1.c(notification$Action);
        }
        if (notification$Action.getIcon() == null) {
            final int icon = notification$Action.icon;
            if (icon != 0) {
                return new NotificationCompat$Action(icon, notification$Action.title, notification$Action.actionIntent, notification$Action.getExtras(), array, (RemoteInput[])null, b, n, boolean1, b2, c);
            }
        }
        if (notification$Action.getIcon() != null) {
            final Icon icon2 = notification$Action.getIcon();
            final PorterDuff$Mode k = IconCompat.k;
            if (IconCompat.a.d(icon2) != 2 || IconCompat.a.b(icon2) != 0) {
                a = IconCompat.a.a(icon2);
            }
        }
        return new NotificationCompat$Action(a, notification$Action.title, notification$Action.actionIntent, notification$Action.getExtras(), array, (RemoteInput[])null, b, n, boolean1, b2, c);
    }
    
    public static int getActionCount(final Notification notification) {
        final Notification$Action[] actions = notification.actions;
        int length;
        if (actions != null) {
            length = actions.length;
        }
        else {
            length = 0;
        }
        return length;
    }
    
    public static boolean getAllowSystemGeneratedContextualActions(final Notification notification) {
        return Build$VERSION.SDK_INT >= 29 && c2.l(notification);
    }
    
    public static boolean getAutoCancel(final Notification notification) {
        return (notification.flags & 0x10) != 0x0;
    }
    
    public static int getBadgeIconType(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return v.a(notification);
        }
        return 0;
    }
    
    public static NotificationCompat.NotificationCompat$BubbleMetadata getBubbleMetadata(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 29) {
            return NotificationCompat.NotificationCompat$BubbleMetadata.fromPlatform(b1.b(notification));
        }
        return null;
    }
    
    public static String getCategory(final Notification notification) {
        return notification.category;
    }
    
    public static String getChannelId(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return s.b(notification);
        }
        return null;
    }
    
    public static int getColor(final Notification notification) {
        return notification.color;
    }
    
    public static CharSequence getContentInfo(final Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }
    
    public static CharSequence getContentText(final Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }
    
    public static CharSequence getContentTitle(final Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }
    
    public static Bundle getExtras(final Notification notification) {
        return notification.extras;
    }
    
    public static String getGroup(final Notification notification) {
        return notification.getGroup();
    }
    
    public static int getGroupAlertBehavior(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return q.a(notification);
        }
        return 0;
    }
    
    public static boolean getHighPriority(final Notification notification) {
        return (notification.flags & 0x80) != 0x0;
    }
    
    public static List<NotificationCompat$Action> getInvisibleActions(final Notification notification) {
        final ArrayList list = new ArrayList();
        final Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return list;
        }
        final Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i = 0; i < ((BaseBundle)bundle2).size(); ++i) {
                final Bundle bundle3 = bundle2.getBundle(Integer.toString(i));
                final Object a = b.a;
                final Bundle bundle4 = bundle3.getBundle("extras");
                list.add(new NotificationCompat$Action(((BaseBundle)bundle3).getInt("icon"), bundle3.getCharSequence("title"), (PendingIntent)bundle3.getParcelable("actionIntent"), bundle3.getBundle("extras"), b.a(b.b(bundle3, "remoteInputs")), b.a(b.b(bundle3, "dataOnlyRemoteInputs")), bundle4 != null && ((BaseBundle)bundle4).getBoolean("android.support.allowGeneratedReplies", false), ((BaseBundle)bundle3).getInt("semanticAction"), ((BaseBundle)bundle3).getBoolean("showsUserInterface"), false, false));
            }
        }
        return list;
    }
    
    public static boolean getLocalOnly(final Notification notification) {
        return (notification.flags & 0x100) != 0x0;
    }
    
    public static n3.b getLocusId(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 29) {
            final LocusId b = z.b(notification);
            if (b != null) {
                final String b2 = n3.b.a.b(b);
                if (!TextUtils.isEmpty((CharSequence)b2)) {
                    return new n3.b(b2);
                }
                throw new IllegalArgumentException("id cannot be empty");
            }
        }
        return null;
    }
    
    public static Notification[] getNotificationArrayFromBundle(final Bundle bundle, final String s) {
        final Parcelable[] parcelableArray = bundle.getParcelableArray(s);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            final Notification[] array = new Notification[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; ++i) {
                array[i] = (Notification)parcelableArray[i];
            }
            bundle.putParcelableArray(s, (Parcelable[])array);
            return array;
        }
        return (Notification[])parcelableArray;
    }
    
    public static boolean getOngoing(final Notification notification) {
        return (notification.flags & 0x2) != 0x0;
    }
    
    public static boolean getOnlyAlertOnce(final Notification notification) {
        return (notification.flags & 0x8) != 0x0;
    }
    
    public static List<Person> getPeople(final Notification notification) {
        final ArrayList list = new ArrayList();
        if (Build$VERSION.SDK_INT >= 28) {
            final ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                final Iterator iterator = parcelableArrayList.iterator();
                while (iterator.hasNext()) {
                    list.add(Person.fromAndroidPerson((android.app.Person)iterator.next()));
                }
            }
        }
        else {
            final String[] stringArray = ((BaseBundle)notification.extras).getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (int length = stringArray.length, i = 0; i < length; ++i) {
                    list.add(new Person.Builder().setUri(stringArray[i]).build());
                }
            }
        }
        return list;
    }
    
    public static Notification getPublicVersion(final Notification notification) {
        return notification.publicVersion;
    }
    
    public static CharSequence getSettingsText(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return r.b(notification);
        }
        return null;
    }
    
    public static String getShortcutId(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return o.e(notification);
        }
        return null;
    }
    
    public static boolean getShowWhen(final Notification notification) {
        return ((BaseBundle)notification.extras).getBoolean("android.showWhen");
    }
    
    public static String getSortKey(final Notification notification) {
        return notification.getSortKey();
    }
    
    public static CharSequence getSubText(final Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }
    
    public static long getTimeoutAfter(final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return w.b(notification);
        }
        return 0L;
    }
    
    public static boolean getUsesChronometer(final Notification notification) {
        return ((BaseBundle)notification.extras).getBoolean("android.showChronometer");
    }
    
    public static int getVisibility(final Notification notification) {
        return notification.visibility;
    }
    
    public static boolean isGroupSummary(final Notification notification) {
        return (notification.flags & 0x200) != 0x0;
    }
    
    public static class BigPictureStyle extends Style
    {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;
        
        public BigPictureStyle() {
        }
        
        public BigPictureStyle(final NotificationCompat$Builder builder) {
            ((Style)this).setBuilder(builder);
        }
        
        private static IconCompat asIconCompat(final Parcelable parcelable) {
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    final Icon icon = (Icon)parcelable;
                    final PorterDuff$Mode k = IconCompat.k;
                    return IconCompat.a.a(icon);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.c((Bitmap)parcelable);
                }
            }
            return null;
        }
        
        public static IconCompat getPictureIcon(final Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            final Parcelable parcelable = bundle.getParcelable("android.picture");
            if (parcelable != null) {
                return asIconCompat(parcelable);
            }
            return asIconCompat(bundle.getParcelable("android.pictureIcon"));
        }
        
        @Override
        public void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final Notification$BigPictureStyle setBigContentTitle = new Notification$BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(super.mBigContentTitle);
            final IconCompat mPictureIcon = this.mPictureIcon;
            Context a = null;
            Notification$BigPictureStyle bigPicture = setBigContentTitle;
            if (mPictureIcon != null) {
                if (sdk_INT >= 31) {
                    Context a2;
                    if (notificationBuilderWithBuilderAccessor instanceof a) {
                        a2 = ((a)notificationBuilderWithBuilderAccessor).a;
                    }
                    else {
                        a2 = null;
                    }
                    BigPictureStyle.NotificationCompat$BigPictureStyle$c.a(setBigContentTitle, IconCompat.a.g(mPictureIcon, a2));
                    bigPicture = setBigContentTitle;
                }
                else {
                    int n;
                    if ((n = mPictureIcon.a) == -1) {
                        n = IconCompat.a.d(mPictureIcon.b);
                    }
                    bigPicture = setBigContentTitle;
                    if (n == 1) {
                        final IconCompat mPictureIcon2 = this.mPictureIcon;
                        final int a3 = mPictureIcon2.a;
                        Bitmap b2;
                        if (a3 == -1) {
                            final Object b = mPictureIcon2.b;
                            if (b instanceof Bitmap) {
                                b2 = (Bitmap)b;
                            }
                            else {
                                b2 = null;
                            }
                        }
                        else if (a3 == 1) {
                            b2 = (Bitmap)mPictureIcon2.b;
                        }
                        else {
                            if (a3 != 5) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("called getBitmap() on ");
                                sb.append(mPictureIcon2);
                                throw new IllegalStateException(sb.toString());
                            }
                            b2 = IconCompat.b((Bitmap)mPictureIcon2.b, true);
                        }
                        bigPicture = setBigContentTitle.bigPicture(b2);
                    }
                }
            }
            if (this.mBigLargeIconSet) {
                final IconCompat mBigLargeIcon = this.mBigLargeIcon;
                if (mBigLargeIcon == null) {
                    BigPictureStyle.NotificationCompat$BigPictureStyle$a.a(bigPicture, (Bitmap)null);
                }
                else {
                    if (notificationBuilderWithBuilderAccessor instanceof a) {
                        a = ((a)notificationBuilderWithBuilderAccessor).a;
                    }
                    BigPictureStyle.NotificationCompat$BigPictureStyle$b.a(bigPicture, IconCompat.a.g(mBigLargeIcon, a));
                }
            }
            if (super.mSummaryTextSet) {
                BigPictureStyle.NotificationCompat$BigPictureStyle$a.b(bigPicture, super.mSummaryText);
            }
            if (sdk_INT >= 31) {
                BigPictureStyle.NotificationCompat$BigPictureStyle$c.c(bigPicture, this.mShowBigPictureWhenCollapsed);
                BigPictureStyle.NotificationCompat$BigPictureStyle$c.b(bigPicture, this.mPictureContentDescription);
            }
        }
        
        public BigPictureStyle bigLargeIcon(final Bitmap bitmap) {
            IconCompat c;
            if (bitmap == null) {
                c = null;
            }
            else {
                c = IconCompat.c(bitmap);
            }
            this.mBigLargeIcon = c;
            this.mBigLargeIconSet = true;
            return this;
        }
        
        public BigPictureStyle bigPicture(final Bitmap bitmap) {
            IconCompat c;
            if (bitmap == null) {
                c = null;
            }
            else {
                c = IconCompat.c(bitmap);
            }
            this.mPictureIcon = c;
            return this;
        }
        
        public BigPictureStyle bigPicture(final Icon icon) {
            final PorterDuff$Mode k = IconCompat.k;
            this.mPictureIcon = IconCompat.a.a(icon);
            return this;
        }
        
        @Override
        public void clearCompatExtraKeys(final Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.pictureIcon");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }
        
        @Override
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
        
        @Override
        public void restoreFromCompatExtras(final Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (((BaseBundle)bundle).containsKey("android.largeIcon.big")) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable("android.largeIcon.big"));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = ((BaseBundle)bundle).getBoolean("android.showBigPictureWhenCollapsed");
        }
        
        public BigPictureStyle setBigContentTitle(final CharSequence charSequence) {
            super.mBigContentTitle = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            return this;
        }
        
        public BigPictureStyle setContentDescription(final CharSequence mPictureContentDescription) {
            this.mPictureContentDescription = mPictureContentDescription;
            return this;
        }
        
        public BigPictureStyle setSummaryText(final CharSequence charSequence) {
            super.mSummaryText = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            super.mSummaryTextSet = true;
            return this;
        }
        
        public BigPictureStyle showBigPictureWhenCollapsed(final boolean mShowBigPictureWhenCollapsed) {
            this.mShowBigPictureWhenCollapsed = mShowBigPictureWhenCollapsed;
            return this;
        }
    }
    
    public abstract static class Style
    {
        public CharSequence mBigContentTitle;
        public NotificationCompat$Builder mBuilder;
        public CharSequence mSummaryText;
        public boolean mSummaryTextSet;
        
        public Style() {
            this.mSummaryTextSet = false;
        }
        
        private int calculateTopPadding() {
            final Resources resources = this.mBuilder.mContext.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131166354);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166355);
            final float n = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(n * dimensionPixelSize2 + (1.0f - n) * dimensionPixelSize);
        }
        
        private static float constrain(final float n, float n2, final float n3) {
            if (n >= n2) {
                n2 = n;
                if (n > n3) {
                    n2 = n3;
                }
            }
            return n2;
        }
        
        public static Style constructCompatStyleByName(final String s) {
            if (s != null) {
                int n = -1;
                switch (s) {
                    case "androidx.core.app.NotificationCompat$MessagingStyle": {
                        n = 4;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$BigTextStyle": {
                        n = 3;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$InboxStyle": {
                        n = 2;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$BigPictureStyle": {
                        n = 1;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n) {
                    case 4: {
                        return (Style)new MessagingStyle();
                    }
                    case 3: {
                        return (Style)new BigTextStyle();
                    }
                    case 2: {
                        return (Style)new InboxStyle();
                    }
                    case 1: {
                        return (Style)new BigPictureStyle();
                    }
                    case 0: {
                        return (Style)new DecoratedCustomViewStyle();
                    }
                }
            }
            return null;
        }
        
        private static Style constructCompatStyleByPlatformName(final String s) {
            if (s == null) {
                return null;
            }
            if (s.equals(Notification$BigPictureStyle.class.getName())) {
                return (Style)new BigPictureStyle();
            }
            if (s.equals(Notification$BigTextStyle.class.getName())) {
                return (Style)new BigTextStyle();
            }
            if (s.equals(Notification$InboxStyle.class.getName())) {
                return (Style)new InboxStyle();
            }
            if (s.equals(Notification$MessagingStyle.class.getName())) {
                return (Style)new MessagingStyle();
            }
            if (s.equals(Notification$DecoratedCustomViewStyle.class.getName())) {
                return (Style)new DecoratedCustomViewStyle();
            }
            return null;
        }
        
        public static Style constructCompatStyleForBundle(final Bundle bundle) {
            final Style constructCompatStyleByName = constructCompatStyleByName(((BaseBundle)bundle).getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (constructCompatStyleByName != null) {
                return constructCompatStyleByName;
            }
            if (((BaseBundle)bundle).containsKey("android.selfDisplayName") || ((BaseBundle)bundle).containsKey("android.messagingStyleUser")) {
                return (Style)new MessagingStyle();
            }
            if (((BaseBundle)bundle).containsKey("android.picture") || ((BaseBundle)bundle).containsKey("android.pictureIcon")) {
                return (Style)new BigPictureStyle();
            }
            if (((BaseBundle)bundle).containsKey("android.bigText")) {
                return (Style)new BigTextStyle();
            }
            if (((BaseBundle)bundle).containsKey("android.textLines")) {
                return (Style)new InboxStyle();
            }
            return constructCompatStyleByPlatformName(((BaseBundle)bundle).getString("android.template"));
        }
        
        public static Style constructStyleForExtras(final Bundle bundle) {
            final Style constructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (constructCompatStyleForBundle == null) {
                return null;
            }
            try {
                constructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return constructCompatStyleForBundle;
            }
            catch (final ClassCastException ex) {
                return null;
            }
        }
        
        private Bitmap createColoredBitmap(final int n, final int n2, final int n3) {
            final Context mContext = this.mBuilder.mContext;
            final PorterDuff$Mode k = IconCompat.k;
            mContext.getClass();
            return this.createColoredBitmap(IconCompat.d(mContext.getResources(), mContext.getPackageName(), n), n2, n3);
        }
        
        private Bitmap createColoredBitmap(final IconCompat iconCompat, final int n, final int n2) {
            final Context mContext = this.mBuilder.mContext;
            iconCompat.a(mContext);
            final Drawable f = IconCompat.a.f(IconCompat.a.g(iconCompat, mContext), mContext);
            int intrinsicWidth;
            if (n2 == 0) {
                intrinsicWidth = f.getIntrinsicWidth();
            }
            else {
                intrinsicWidth = n2;
            }
            int intrinsicHeight = n2;
            if (n2 == 0) {
                intrinsicHeight = f.getIntrinsicHeight();
            }
            final Bitmap bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
            f.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (n != 0) {
                f.mutate().setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_IN));
            }
            f.draw(new Canvas(bitmap));
            return bitmap;
        }
        
        private Bitmap createIconWithBackground(int n, int n2, final int n3, final int n4) {
            int n5 = n4;
            if (n4 == 0) {
                n5 = 0;
            }
            final Bitmap coloredBitmap = this.createColoredBitmap(2131232743, n5, n2);
            final Canvas canvas = new Canvas(coloredBitmap);
            final Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(n).mutate();
            mutate.setFilterBitmap(true);
            n = (n2 - n3) / 2;
            n2 = n3 + n;
            mutate.setBounds(n, n, n2, n2);
            mutate.setColorFilter((ColorFilter)new PorterDuffColorFilter(-1, PorterDuff$Mode.SRC_ATOP));
            mutate.draw(canvas);
            return coloredBitmap;
        }
        
        public static Style extractStyleFromNotification(final Notification notification) {
            final Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }
        
        private void hideNormalContent(final RemoteViews remoteViews) {
            remoteViews.setViewVisibility(2131431743, 8);
            remoteViews.setViewVisibility(2131431653, 8);
            remoteViews.setViewVisibility(2131431651, 8);
        }
        
        public void addCompatExtras(final Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence("android.summaryText", this.mSummaryText);
            }
            final CharSequence mBigContentTitle = this.mBigContentTitle;
            if (mBigContentTitle != null) {
                bundle.putCharSequence("android.title.big", mBigContentTitle);
            }
            final String className = this.getClassName();
            if (className != null) {
                ((BaseBundle)bundle).putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
            }
        }
        
        public void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }
        
        public RemoteViews applyStandardTemplate(final boolean b, int n, final boolean b2) {
            final Resources resources = this.mBuilder.mContext.getResources();
            final RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), n);
            this.mBuilder.getPriority();
            final NotificationCompat$Builder mBuilder = this.mBuilder;
            final Bitmap mLargeIcon = mBuilder.mLargeIcon;
            final int n2 = 0;
            if (mLargeIcon != null) {
                remoteViews.setViewVisibility(2131429419, 0);
                remoteViews.setImageViewBitmap(2131429419, this.mBuilder.mLargeIcon);
                if (b && this.mBuilder.mNotification.icon != 0) {
                    n = resources.getDimensionPixelSize(2131166349);
                    final int dimensionPixelSize = resources.getDimensionPixelSize(2131166351);
                    final NotificationCompat$Builder mBuilder2 = this.mBuilder;
                    remoteViews.setImageViewBitmap(2131431020, this.createIconWithBackground(mBuilder2.mNotification.icon, n, n - dimensionPixelSize * 2, mBuilder2.getColor()));
                    remoteViews.setViewVisibility(2131431020, 0);
                }
            }
            else if (b && mBuilder.mNotification.icon != 0) {
                remoteViews.setViewVisibility(2131429419, 0);
                final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166345);
                final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131166339);
                n = resources.getDimensionPixelSize(2131166352);
                final NotificationCompat$Builder mBuilder3 = this.mBuilder;
                remoteViews.setImageViewBitmap(2131429419, this.createIconWithBackground(mBuilder3.mNotification.icon, dimensionPixelSize2 - dimensionPixelSize3, n, mBuilder3.getColor()));
            }
            final CharSequence mContentTitle = this.mBuilder.mContentTitle;
            if (mContentTitle != null) {
                remoteViews.setTextViewText(2131431743, mContentTitle);
            }
            final CharSequence mContentText = this.mBuilder.mContentText;
            final int n3 = 1;
            if (mContentText != null) {
                remoteViews.setTextViewText(2131431651, mContentText);
                n = 1;
            }
            else {
                n = 0;
            }
            final NotificationCompat$Builder mBuilder4 = this.mBuilder;
            final CharSequence mContentInfo = mBuilder4.mContentInfo;
            int n5 = 0;
            Label_0465: {
                if (mContentInfo != null) {
                    remoteViews.setTextViewText(2131429527, mContentInfo);
                    remoteViews.setViewVisibility(2131429527, 0);
                }
                else {
                    if (mBuilder4.mNumber <= 0) {
                        remoteViews.setViewVisibility(2131429527, 8);
                        final int n4 = 0;
                        n5 = n;
                        n = n4;
                        break Label_0465;
                    }
                    n = resources.getInteger(2131492903);
                    if (this.mBuilder.mNumber > n) {
                        remoteViews.setTextViewText(2131429527, (CharSequence)resources.getString(2131957529));
                    }
                    else {
                        remoteViews.setTextViewText(2131429527, (CharSequence)NumberFormat.getIntegerInstance().format(this.mBuilder.mNumber));
                    }
                    remoteViews.setViewVisibility(2131429527, 0);
                }
                n5 = (n = 1);
            }
            final CharSequence mSubText = this.mBuilder.mSubText;
            boolean b3 = false;
            Label_0541: {
                if (mSubText != null) {
                    remoteViews.setTextViewText(2131431651, mSubText);
                    final CharSequence mContentText2 = this.mBuilder.mContentText;
                    if (mContentText2 != null) {
                        remoteViews.setTextViewText(2131431653, mContentText2);
                        remoteViews.setViewVisibility(2131431653, 0);
                        b3 = true;
                        break Label_0541;
                    }
                    remoteViews.setViewVisibility(2131431653, 8);
                }
                b3 = false;
            }
            if (b3) {
                if (b2) {
                    remoteViews.setTextViewTextSize(2131431651, 0, (float)resources.getDimensionPixelSize(2131166353));
                }
                remoteViews.setViewPadding(2131429862, 0, 0, 0, 0);
            }
            if (this.mBuilder.getWhenIfShowing() != 0L) {
                if (this.mBuilder.mUseChronometer) {
                    remoteViews.setViewVisibility(2131428255, 0);
                    remoteViews.setLong(2131428255, "setBase", SystemClock.elapsedRealtime() - System.currentTimeMillis() + this.mBuilder.getWhenIfShowing());
                    remoteViews.setBoolean(2131428255, "setStarted", true);
                    final boolean mChronometerCountDown = this.mBuilder.mChronometerCountDown;
                    n = n3;
                    if (mChronometerCountDown) {
                        remoteViews.setChronometerCountDown(2131428255, mChronometerCountDown);
                        n = n3;
                    }
                }
                else {
                    remoteViews.setViewVisibility(2131431736, 0);
                    remoteViews.setLong(2131431736, "setTime", this.mBuilder.getWhenIfShowing());
                    n = n3;
                }
            }
            if (n != 0) {
                n = 0;
            }
            else {
                n = 8;
            }
            remoteViews.setViewVisibility(2131431022, n);
            if (n5 != 0) {
                n = n2;
            }
            else {
                n = 8;
            }
            remoteViews.setViewVisibility(2131429863, n);
            return remoteViews;
        }
        
        public Notification build() {
            final NotificationCompat$Builder mBuilder = this.mBuilder;
            Notification build;
            if (mBuilder != null) {
                build = mBuilder.build();
            }
            else {
                build = null;
            }
            return build;
        }
        
        public void buildIntoRemoteViews(final RemoteViews remoteViews, final RemoteViews remoteViews2) {
            this.hideNormalContent(remoteViews);
            remoteViews.removeAllViews(2131430305);
            remoteViews.addView(2131430305, remoteViews2.clone());
            remoteViews.setViewVisibility(2131430305, 0);
            remoteViews.setViewPadding(2131430306, 0, this.calculateTopPadding(), 0, 0);
        }
        
        public void clearCompatExtraKeys(final Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }
        
        public Bitmap createColoredBitmap(final int n, final int n2) {
            return this.createColoredBitmap(n, n2, 0);
        }
        
        public Bitmap createColoredBitmap(final IconCompat iconCompat, final int n) {
            return this.createColoredBitmap(iconCompat, n, 0);
        }
        
        public boolean displayCustomViewInline() {
            return false;
        }
        
        public String getClassName() {
            return null;
        }
        
        public RemoteViews makeBigContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
        
        public RemoteViews makeContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
        
        public RemoteViews makeHeadsUpContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
        
        public void restoreFromCompatExtras(final Bundle bundle) {
            if (((BaseBundle)bundle).containsKey("android.summaryText")) {
                this.mSummaryText = bundle.getCharSequence("android.summaryText");
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence("android.title.big");
        }
        
        public void setBuilder(final NotificationCompat$Builder mBuilder) {
            if (this.mBuilder != mBuilder && (this.mBuilder = mBuilder) != null) {
                mBuilder.setStyle(this);
            }
        }
    }
    
    public static class BigTextStyle extends Style
    {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;
        
        public BigTextStyle() {
        }
        
        public BigTextStyle(final NotificationCompat$Builder builder) {
            ((Style)this).setBuilder(builder);
        }
        
        @Override
        public void addCompatExtras(final Bundle bundle) {
            super.addCompatExtras(bundle);
        }
        
        @Override
        public void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            final Notification$BigTextStyle bigText = new Notification$BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(super.mBigContentTitle).bigText(this.mBigText);
            if (super.mSummaryTextSet) {
                bigText.setSummaryText(super.mSummaryText);
            }
        }
        
        public BigTextStyle bigText(final CharSequence charSequence) {
            this.mBigText = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            return this;
        }
        
        @Override
        public void clearCompatExtraKeys(final Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.bigText");
        }
        
        @Override
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
        
        @Override
        public void restoreFromCompatExtras(final Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence("android.bigText");
        }
        
        public BigTextStyle setBigContentTitle(final CharSequence charSequence) {
            super.mBigContentTitle = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            return this;
        }
        
        public BigTextStyle setSummaryText(final CharSequence charSequence) {
            super.mSummaryText = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            super.mSummaryTextSet = true;
            return this;
        }
    }
    
    public static final class CarExtender implements NotificationCompat$Extender
    {
        public static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        public static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private CarExtender.NotificationCompat$CarExtender$UnreadConversation mUnreadConversation;
        
        public CarExtender() {
            this.mColor = 0;
        }
        
        public CarExtender(final Notification notification) {
            this.mColor = 0;
            Object bundle;
            if (NotificationCompat.getExtras(notification) == null) {
                bundle = null;
            }
            else {
                bundle = NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS");
            }
            if (bundle != null) {
                this.mLargeIcon = (Bitmap)((Bundle)bundle).getParcelable("large_icon");
                this.mColor = ((BaseBundle)bundle).getInt("app_color", 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(((Bundle)bundle).getBundle("car_conversation"));
            }
        }
        
        private static Bundle getBundleForUnreadConversation(final CarExtender.NotificationCompat$CarExtender$UnreadConversation notificationCompat$CarExtender$UnreadConversation) {
            final Bundle bundle = new Bundle();
            final String[] participants = notificationCompat$CarExtender$UnreadConversation.getParticipants();
            int i = 0;
            String s;
            if (participants != null && notificationCompat$CarExtender$UnreadConversation.getParticipants().length > 1) {
                s = notificationCompat$CarExtender$UnreadConversation.getParticipants()[0];
            }
            else {
                s = null;
            }
            final int length = notificationCompat$CarExtender$UnreadConversation.getMessages().length;
            final Parcelable[] array = new Parcelable[length];
            while (i < length) {
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putString("text", notificationCompat$CarExtender$UnreadConversation.getMessages()[i]);
                ((BaseBundle)bundle2).putString("author", s);
                array[i] = (Parcelable)bundle2;
                ++i;
            }
            bundle.putParcelableArray("messages", array);
            final RemoteInput remoteInput = notificationCompat$CarExtender$UnreadConversation.getRemoteInput();
            if (remoteInput != null) {
                bundle.putParcelable("remote_input", (Parcelable)new RemoteInput$Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras()).build());
            }
            bundle.putParcelable("on_reply", (Parcelable)notificationCompat$CarExtender$UnreadConversation.getReplyPendingIntent());
            bundle.putParcelable("on_read", (Parcelable)notificationCompat$CarExtender$UnreadConversation.getReadPendingIntent());
            ((BaseBundle)bundle).putStringArray("participants", notificationCompat$CarExtender$UnreadConversation.getParticipants());
            ((BaseBundle)bundle).putLong("timestamp", notificationCompat$CarExtender$UnreadConversation.getLatestTimestamp());
            return bundle;
        }
        
        private static CarExtender.NotificationCompat$CarExtender$UnreadConversation getUnreadConversationFromBundle(final Bundle bundle) {
            final CarExtender.NotificationCompat$CarExtender$UnreadConversation notificationCompat$CarExtender$UnreadConversation = null;
            final RemoteInput remoteInput = null;
            if (bundle == null) {
                return null;
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            final int n = 0;
            String[] array = null;
            Label_0114: {
                if (parcelableArray != null) {
                    final int length = parcelableArray.length;
                    array = new String[length];
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final Parcelable parcelable = parcelableArray[i];
                            if (parcelable instanceof Bundle && (array[i] = ((BaseBundle)parcelable).getString("text")) != null) {
                                ++i;
                            }
                            else {
                                final boolean b = false;
                                if (b) {
                                    break Label_0114;
                                }
                                return null;
                            }
                        }
                        final boolean b = true;
                        continue;
                    }
                }
                array = null;
            }
            final PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("on_read");
            final PendingIntent pendingIntent2 = (PendingIntent)bundle.getParcelable("on_reply");
            final android.app.RemoteInput remoteInput2 = (android.app.RemoteInput)bundle.getParcelable("remote_input");
            final String[] stringArray = ((BaseBundle)bundle).getStringArray("participants");
            CarExtender.NotificationCompat$CarExtender$UnreadConversation notificationCompat$CarExtender$UnreadConversation2 = notificationCompat$CarExtender$UnreadConversation;
            if (stringArray != null) {
                if (stringArray.length != 1) {
                    notificationCompat$CarExtender$UnreadConversation2 = notificationCompat$CarExtender$UnreadConversation;
                }
                else {
                    RemoteInput remoteInput3 = remoteInput;
                    if (remoteInput2 != null) {
                        final String resultKey = remoteInput2.getResultKey();
                        final CharSequence label = remoteInput2.getLabel();
                        final CharSequence[] choices = remoteInput2.getChoices();
                        final boolean allowFreeFormInput = remoteInput2.getAllowFreeFormInput();
                        int a = n;
                        if (Build$VERSION.SDK_INT >= 29) {
                            a = c2.a(remoteInput2);
                        }
                        remoteInput3 = new RemoteInput(resultKey, label, choices, allowFreeFormInput, a, remoteInput2.getExtras(), null);
                    }
                    notificationCompat$CarExtender$UnreadConversation2 = new CarExtender.NotificationCompat$CarExtender$UnreadConversation(array, remoteInput3, pendingIntent2, pendingIntent, stringArray, ((BaseBundle)bundle).getLong("timestamp"));
                }
            }
            return notificationCompat$CarExtender$UnreadConversation2;
        }
        
        public NotificationCompat$Builder extend(final NotificationCompat$Builder notificationCompat$Builder) {
            final Bundle bundle = new Bundle();
            final Bitmap mLargeIcon = this.mLargeIcon;
            if (mLargeIcon != null) {
                bundle.putParcelable("large_icon", (Parcelable)mLargeIcon);
            }
            final int mColor = this.mColor;
            if (mColor != 0) {
                ((BaseBundle)bundle).putInt("app_color", mColor);
            }
            final CarExtender.NotificationCompat$CarExtender$UnreadConversation mUnreadConversation = this.mUnreadConversation;
            if (mUnreadConversation != null) {
                bundle.putBundle("car_conversation", getBundleForUnreadConversation(mUnreadConversation));
            }
            notificationCompat$Builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            return notificationCompat$Builder;
        }
        
        public int getColor() {
            return this.mColor;
        }
        
        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }
        
        @Deprecated
        public CarExtender.NotificationCompat$CarExtender$UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }
        
        public CarExtender setColor(final int mColor) {
            this.mColor = mColor;
            return this;
        }
        
        public CarExtender setLargeIcon(final Bitmap mLargeIcon) {
            this.mLargeIcon = mLargeIcon;
            return this;
        }
        
        @Deprecated
        public CarExtender setUnreadConversation(final CarExtender.NotificationCompat$CarExtender$UnreadConversation mUnreadConversation) {
            this.mUnreadConversation = mUnreadConversation;
            return this;
        }
    }
    
    public static class DecoratedCustomViewStyle extends Style
    {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        
        private RemoteViews createRemoteViews(final RemoteViews remoteViews, final boolean b) {
            final int n = 1;
            final int n2 = 0;
            final RemoteViews applyStandardTemplate = ((Style)this).applyStandardTemplate(true, 2131624949, false);
            applyStandardTemplate.removeAllViews(2131427542);
            final List<NotificationCompat$Action> nonContextualActions = getNonContextualActions(super.mBuilder.mActions);
            int n4 = 0;
            Label_0106: {
                if (b && nonContextualActions != null) {
                    final int min = Math.min(nonContextualActions.size(), 3);
                    if (min > 0) {
                        int n3 = 0;
                        while (true) {
                            n4 = n;
                            if (n3 >= min) {
                                break Label_0106;
                            }
                            applyStandardTemplate.addView(2131427542, this.generateActionButton((NotificationCompat$Action)nonContextualActions.get(n3)));
                            ++n3;
                        }
                    }
                }
                n4 = 0;
            }
            int n5;
            if (n4 != 0) {
                n5 = n2;
            }
            else {
                n5 = 8;
            }
            applyStandardTemplate.setViewVisibility(2131427542, n5);
            applyStandardTemplate.setViewVisibility(2131427461, n5);
            ((Style)this).buildIntoRemoteViews(applyStandardTemplate, remoteViews);
            return applyStandardTemplate;
        }
        
        private RemoteViews generateActionButton(final NotificationCompat$Action notificationCompat$Action) {
            final boolean b = notificationCompat$Action.actionIntent == null;
            final String packageName = super.mBuilder.mContext.getPackageName();
            int n;
            if (b) {
                n = 2131624940;
            }
            else {
                n = 2131624939;
            }
            final RemoteViews remoteViews = new RemoteViews(packageName, n);
            final IconCompat iconCompat = notificationCompat$Action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(2131427477, ((Style)this).createColoredBitmap(iconCompat, super.mBuilder.mContext.getResources().getColor(2131100371)));
            }
            remoteViews.setTextViewText(2131427527, notificationCompat$Action.title);
            if (!b) {
                remoteViews.setOnClickPendingIntent(2131427451, notificationCompat$Action.actionIntent);
            }
            remoteViews.setContentDescription(2131427451, notificationCompat$Action.title);
            return remoteViews;
        }
        
        private static List<NotificationCompat$Action> getNonContextualActions(final List<NotificationCompat$Action> list) {
            if (list == null) {
                return null;
            }
            final ArrayList list2 = new ArrayList();
            for (final NotificationCompat$Action notificationCompat$Action : list) {
                if (!notificationCompat$Action.isContextual()) {
                    list2.add(notificationCompat$Action);
                }
            }
            return list2;
        }
        
        @Override
        public void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle((Notification$Style)new Notification$DecoratedCustomViewStyle());
        }
        
        @Override
        public boolean displayCustomViewInline() {
            return true;
        }
        
        @Override
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
        
        @Override
        public RemoteViews makeBigContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
        
        @Override
        public RemoteViews makeContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
        
        @Override
        public RemoteViews makeHeadsUpContentView(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }
    
    public static class InboxStyle extends Style
    {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts;
        
        public InboxStyle() {
            this.mTexts = new ArrayList<CharSequence>();
        }
        
        public InboxStyle(final NotificationCompat$Builder builder) {
            this.mTexts = new ArrayList<CharSequence>();
            ((Style)this).setBuilder(builder);
        }
        
        public InboxStyle addLine(final CharSequence charSequence) {
            if (charSequence != null) {
                this.mTexts.add(NotificationCompat$Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }
        
        @Override
        public void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            final Notification$InboxStyle setBigContentTitle = new Notification$InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(super.mBigContentTitle);
            if (super.mSummaryTextSet) {
                setBigContentTitle.setSummaryText(super.mSummaryText);
            }
            final Iterator<CharSequence> iterator = this.mTexts.iterator();
            while (iterator.hasNext()) {
                setBigContentTitle.addLine((CharSequence)iterator.next());
            }
        }
        
        @Override
        public void clearCompatExtraKeys(final Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.textLines");
        }
        
        @Override
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
        
        @Override
        public void restoreFromCompatExtras(final Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (((BaseBundle)bundle).containsKey("android.textLines")) {
                Collections.addAll(this.mTexts, bundle.getCharSequenceArray("android.textLines"));
            }
        }
        
        public InboxStyle setBigContentTitle(final CharSequence charSequence) {
            super.mBigContentTitle = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            return this;
        }
        
        public InboxStyle setSummaryText(final CharSequence charSequence) {
            super.mSummaryText = NotificationCompat$Builder.limitCharSequenceLength(charSequence);
            super.mSummaryTextSet = true;
            return this;
        }
    }
    
    public static class MessagingStyle extends Style
    {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private CharSequence mConversationTitle;
        private final List<MessagingStyle.NotificationCompat$MessagingStyle$Message> mHistoricMessages;
        private Boolean mIsGroupConversation;
        private final List<MessagingStyle.NotificationCompat$MessagingStyle$Message> mMessages;
        private Person mUser;
        
        public MessagingStyle() {
            this.mMessages = new ArrayList<MessagingStyle.NotificationCompat$MessagingStyle$Message>();
            this.mHistoricMessages = new ArrayList<MessagingStyle.NotificationCompat$MessagingStyle$Message>();
        }
        
        public MessagingStyle(final Person mUser) {
            this.mMessages = new ArrayList<MessagingStyle.NotificationCompat$MessagingStyle$Message>();
            this.mHistoricMessages = new ArrayList<MessagingStyle.NotificationCompat$MessagingStyle$Message>();
            if (!TextUtils.isEmpty(mUser.getName())) {
                this.mUser = mUser;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        
        @Deprecated
        public MessagingStyle(final CharSequence name) {
            this.mMessages = new ArrayList<MessagingStyle.NotificationCompat$MessagingStyle$Message>();
            this.mHistoricMessages = new ArrayList<MessagingStyle.NotificationCompat$MessagingStyle$Message>();
            this.mUser = new Person.Builder().setName(name).build();
        }
        
        public static MessagingStyle extractMessagingStyleFromNotification(final Notification notification) {
            final Style styleFromNotification = Style.extractStyleFromNotification(notification);
            if (styleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle)styleFromNotification;
            }
            return null;
        }
        
        private MessagingStyle.NotificationCompat$MessagingStyle$Message findLatestIncomingMessage() {
            int size = this.mMessages.size();
            while (true) {
                final int n = size - 1;
                if (n >= 0) {
                    final MessagingStyle.NotificationCompat$MessagingStyle$Message notificationCompat$MessagingStyle$Message = this.mMessages.get(n);
                    size = n;
                    if (notificationCompat$MessagingStyle$Message.getPerson() == null) {
                        continue;
                    }
                    size = n;
                    if (!TextUtils.isEmpty(notificationCompat$MessagingStyle$Message.getPerson().getName())) {
                        return notificationCompat$MessagingStyle$Message;
                    }
                    continue;
                }
                else {
                    if (!this.mMessages.isEmpty()) {
                        final List<MessagingStyle.NotificationCompat$MessagingStyle$Message> mMessages = this.mMessages;
                        return mMessages.get(mMessages.size() - 1);
                    }
                    return null;
                }
            }
        }
        
        private boolean hasMessagesWithoutSender() {
            for (int i = this.mMessages.size() - 1; i >= 0; --i) {
                final MessagingStyle.NotificationCompat$MessagingStyle$Message notificationCompat$MessagingStyle$Message = this.mMessages.get(i);
                if (notificationCompat$MessagingStyle$Message.getPerson() != null && notificationCompat$MessagingStyle$Message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }
        
        private TextAppearanceSpan makeFontColorSpan(final int n) {
            return new TextAppearanceSpan((String)null, 0, 0, ColorStateList.valueOf(n), (ColorStateList)null);
        }
        
        private CharSequence makeMessageLine(final MessagingStyle.NotificationCompat$MessagingStyle$Message notificationCompat$MessagingStyle$Message) {
            final y3.a c = y3.a.c();
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            final Person person = notificationCompat$MessagingStyle$Message.getPerson();
            final String s = "";
            CharSequence charSequence;
            if (person == null) {
                charSequence = "";
            }
            else {
                charSequence = notificationCompat$MessagingStyle$Message.getPerson().getName();
            }
            final boolean empty = TextUtils.isEmpty(charSequence);
            int color = -16777216;
            if (empty) {
                final CharSequence charSequence2 = charSequence = this.mUser.getName();
                color = color;
                if (super.mBuilder.getColor() != 0) {
                    color = super.mBuilder.getColor();
                    charSequence = charSequence2;
                }
            }
            final SpannableStringBuilder d = c.d(charSequence, c.c);
            spannableStringBuilder.append((CharSequence)d);
            spannableStringBuilder.setSpan((Object)this.makeFontColorSpan(color), spannableStringBuilder.length() - d.length(), spannableStringBuilder.length(), 33);
            CharSequence text;
            if (notificationCompat$MessagingStyle$Message.getText() == null) {
                text = s;
            }
            else {
                text = notificationCompat$MessagingStyle$Message.getText();
            }
            spannableStringBuilder.append((CharSequence)"  ").append((CharSequence)c.d(text, c.c));
            return (CharSequence)spannableStringBuilder;
        }
        
        @Override
        public void addCompatExtras(final Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.mUser.getName());
            bundle.putBundle("android.messagingStyleUser", this.mUser.toBundle());
            bundle.putCharSequence("android.hiddenConversationTitle", this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation) {
                bundle.putCharSequence("android.conversationTitle", this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                bundle.putParcelableArray("android.messages", (Parcelable[])MessagingStyle.NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages((List)this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", (Parcelable[])MessagingStyle.NotificationCompat$MessagingStyle$Message.getBundleArrayForMessages((List)this.mHistoricMessages));
            }
            final Boolean mIsGroupConversation = this.mIsGroupConversation;
            if (mIsGroupConversation != null) {
                ((BaseBundle)bundle).putBoolean("android.isGroupConversation", (boolean)mIsGroupConversation);
            }
        }
        
        public MessagingStyle addHistoricMessage(final MessagingStyle.NotificationCompat$MessagingStyle$Message notificationCompat$MessagingStyle$Message) {
            if (notificationCompat$MessagingStyle$Message != null) {
                this.mHistoricMessages.add(notificationCompat$MessagingStyle$Message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }
        
        public MessagingStyle addMessage(final MessagingStyle.NotificationCompat$MessagingStyle$Message notificationCompat$MessagingStyle$Message) {
            if (notificationCompat$MessagingStyle$Message != null) {
                this.mMessages.add(notificationCompat$MessagingStyle$Message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }
        
        public MessagingStyle addMessage(final CharSequence charSequence, final long n, final Person person) {
            this.addMessage(new MessagingStyle.NotificationCompat$MessagingStyle$Message(charSequence, n, person));
            return this;
        }
        
        @Deprecated
        public MessagingStyle addMessage(final CharSequence charSequence, final long n, final CharSequence name) {
            this.mMessages.add(new MessagingStyle.NotificationCompat$MessagingStyle$Message(charSequence, n, new Person.Builder().setName(name).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }
        
        @Override
        public void apply(final NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            this.setGroupConversation(this.isGroupConversation());
            Notification$MessagingStyle notification$MessagingStyle;
            if (Build$VERSION.SDK_INT >= 28) {
                notification$MessagingStyle = new Notification$MessagingStyle(this.mUser.toAndroidPerson());
            }
            else {
                notification$MessagingStyle = new Notification$MessagingStyle(this.mUser.getName());
            }
            final Iterator<MessagingStyle.NotificationCompat$MessagingStyle$Message> iterator = this.mMessages.iterator();
            while (iterator.hasNext()) {
                notification$MessagingStyle.addMessage(iterator.next().toAndroidMessage());
            }
            if (Build$VERSION.SDK_INT >= 26) {
                final Iterator<MessagingStyle.NotificationCompat$MessagingStyle$Message> iterator2 = this.mHistoricMessages.iterator();
                while (iterator2.hasNext()) {
                    notification$MessagingStyle.addHistoricMessage(iterator2.next().toAndroidMessage());
                }
            }
            if (this.mIsGroupConversation || Build$VERSION.SDK_INT >= 28) {
                notification$MessagingStyle.setConversationTitle(this.mConversationTitle);
            }
            if (Build$VERSION.SDK_INT >= 28) {
                notification$MessagingStyle.setGroupConversation((boolean)this.mIsGroupConversation);
            }
            ((Notification$Style)notification$MessagingStyle).setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
        }
        
        @Override
        public void clearCompatExtraKeys(final Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }
        
        @Override
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
        
        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }
        
        public List<MessagingStyle.NotificationCompat$MessagingStyle$Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }
        
        public List<MessagingStyle.NotificationCompat$MessagingStyle$Message> getMessages() {
            return this.mMessages;
        }
        
        public Person getUser() {
            return this.mUser;
        }
        
        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }
        
        public boolean isGroupConversation() {
            final NotificationCompat$Builder mBuilder = super.mBuilder;
            final boolean b = false;
            boolean b2 = false;
            if (mBuilder != null && mBuilder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.mIsGroupConversation == null) {
                if (this.mConversationTitle != null) {
                    b2 = true;
                }
                return b2;
            }
            final Boolean mIsGroupConversation = this.mIsGroupConversation;
            boolean booleanValue = b;
            if (mIsGroupConversation != null) {
                booleanValue = mIsGroupConversation;
            }
            return booleanValue;
        }
        
        @Override
        public void restoreFromCompatExtras(final Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            if (((BaseBundle)bundle).containsKey("android.messagingStyleUser")) {
                this.mUser = Person.fromBundle(bundle.getBundle("android.messagingStyleUser"));
            }
            else {
                this.mUser = new Person.Builder().setName(((BaseBundle)bundle).getString("android.selfDisplayName")).build();
            }
            final CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.mMessages.addAll(MessagingStyle.NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(parcelableArray));
            }
            final Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(MessagingStyle.NotificationCompat$MessagingStyle$Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (((BaseBundle)bundle).containsKey("android.isGroupConversation")) {
                this.mIsGroupConversation = ((BaseBundle)bundle).getBoolean("android.isGroupConversation");
            }
        }
        
        public MessagingStyle setConversationTitle(final CharSequence mConversationTitle) {
            this.mConversationTitle = mConversationTitle;
            return this;
        }
        
        public MessagingStyle setGroupConversation(final boolean b) {
            this.mIsGroupConversation = b;
            return this;
        }
    }
    
    public static final class WearableExtender implements NotificationCompat$Extender
    {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<NotificationCompat$Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;
        
        public WearableExtender() {
            this.mActions = new ArrayList<NotificationCompat$Action>();
            this.mFlags = 1;
            this.mPages = new ArrayList<Notification>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }
        
        public WearableExtender(final Notification notification) {
            this.mActions = new ArrayList<NotificationCompat$Action>();
            this.mFlags = 1;
            this.mPages = new ArrayList<Notification>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
            final Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle;
            if (extras != null) {
                bundle = extras.getBundle("android.wearable.EXTENSIONS");
            }
            else {
                bundle = null;
            }
            if (bundle != null) {
                final ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    final int size = parcelableArrayList.size();
                    final NotificationCompat$Action[] array = new NotificationCompat$Action[size];
                    for (int i = 0; i < size; ++i) {
                        array[i] = NotificationCompat.getActionCompatFromAction((Notification$Action)parcelableArrayList.get(i));
                    }
                    Collections.addAll(this.mActions, array);
                }
                this.mFlags = ((BaseBundle)bundle).getInt("flags", 1);
                this.mDisplayIntent = (PendingIntent)bundle.getParcelable("displayIntent");
                final Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, "pages");
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap)bundle.getParcelable("background");
                this.mContentIcon = ((BaseBundle)bundle).getInt("contentIcon");
                this.mContentIconGravity = ((BaseBundle)bundle).getInt("contentIconGravity", 8388613);
                this.mContentActionIndex = ((BaseBundle)bundle).getInt("contentActionIndex", -1);
                this.mCustomSizePreset = ((BaseBundle)bundle).getInt("customSizePreset", 0);
                this.mCustomContentHeight = ((BaseBundle)bundle).getInt("customContentHeight");
                this.mGravity = ((BaseBundle)bundle).getInt("gravity", 80);
                this.mHintScreenTimeout = ((BaseBundle)bundle).getInt("hintScreenTimeout");
                this.mDismissalId = ((BaseBundle)bundle).getString("dismissalId");
                this.mBridgeTag = ((BaseBundle)bundle).getString("bridgeTag");
            }
        }
        
        private static Notification$Action getActionFromActionCompat(final NotificationCompat$Action notificationCompat$Action) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final IconCompat iconCompat = notificationCompat$Action.getIconCompat();
            Icon g = null;
            if (iconCompat != null) {
                g = IconCompat.a.g(iconCompat, null);
            }
            final Notification$Action$Builder notification$Action$Builder = new Notification$Action$Builder(g, notificationCompat$Action.getTitle(), notificationCompat$Action.getActionIntent());
            Bundle bundle;
            if (notificationCompat$Action.getExtras() != null) {
                bundle = new Bundle(notificationCompat$Action.getExtras());
            }
            else {
                bundle = new Bundle();
            }
            ((BaseBundle)bundle).putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action.getAllowGeneratedReplies());
            notification$Action$Builder.setAllowGeneratedReplies(notificationCompat$Action.getAllowGeneratedReplies());
            if (sdk_INT >= 31) {
                h.a(notification$Action$Builder, notificationCompat$Action.isAuthenticationRequired());
            }
            notification$Action$Builder.addExtras(bundle);
            final RemoteInput[] remoteInputs = notificationCompat$Action.getRemoteInputs();
            if (remoteInputs != null) {
                final android.app.RemoteInput[] fromCompat = RemoteInput.fromCompat(remoteInputs);
                for (int length = fromCompat.length, i = 0; i < length; ++i) {
                    notification$Action$Builder.addRemoteInput(fromCompat[i]);
                }
            }
            return notification$Action$Builder.build();
        }
        
        private void setFlag(final int n, final boolean b) {
            if (b) {
                this.mFlags |= n;
            }
            else {
                this.mFlags &= ~n;
            }
        }
        
        public WearableExtender addAction(final NotificationCompat$Action notificationCompat$Action) {
            this.mActions.add(notificationCompat$Action);
            return this;
        }
        
        public WearableExtender addActions(final List<NotificationCompat$Action> list) {
            this.mActions.addAll(list);
            return this;
        }
        
        @Deprecated
        public WearableExtender addPage(final Notification notification) {
            this.mPages.add(notification);
            return this;
        }
        
        @Deprecated
        public WearableExtender addPages(final List<Notification> list) {
            this.mPages.addAll(list);
            return this;
        }
        
        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }
        
        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }
        
        public WearableExtender clone() {
            final WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<NotificationCompat$Action>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<Notification>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }
        
        public NotificationCompat$Builder extend(final NotificationCompat$Builder notificationCompat$Builder) {
            final Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                final ArrayList list = new ArrayList(this.mActions.size());
                final Iterator<NotificationCompat$Action> iterator = this.mActions.iterator();
                while (iterator.hasNext()) {
                    list.add(getActionFromActionCompat(iterator.next()));
                }
                bundle.putParcelableArrayList("actions", list);
            }
            final int mFlags = this.mFlags;
            if (mFlags != 1) {
                ((BaseBundle)bundle).putInt("flags", mFlags);
            }
            final PendingIntent mDisplayIntent = this.mDisplayIntent;
            if (mDisplayIntent != null) {
                bundle.putParcelable("displayIntent", (Parcelable)mDisplayIntent);
            }
            if (!this.mPages.isEmpty()) {
                final ArrayList<Notification> mPages = this.mPages;
                bundle.putParcelableArray("pages", (Parcelable[])mPages.toArray((Parcelable[])new Notification[mPages.size()]));
            }
            final Bitmap mBackground = this.mBackground;
            if (mBackground != null) {
                bundle.putParcelable("background", (Parcelable)mBackground);
            }
            final int mContentIcon = this.mContentIcon;
            if (mContentIcon != 0) {
                ((BaseBundle)bundle).putInt("contentIcon", mContentIcon);
            }
            final int mContentIconGravity = this.mContentIconGravity;
            if (mContentIconGravity != 8388613) {
                ((BaseBundle)bundle).putInt("contentIconGravity", mContentIconGravity);
            }
            final int mContentActionIndex = this.mContentActionIndex;
            if (mContentActionIndex != -1) {
                ((BaseBundle)bundle).putInt("contentActionIndex", mContentActionIndex);
            }
            final int mCustomSizePreset = this.mCustomSizePreset;
            if (mCustomSizePreset != 0) {
                ((BaseBundle)bundle).putInt("customSizePreset", mCustomSizePreset);
            }
            final int mCustomContentHeight = this.mCustomContentHeight;
            if (mCustomContentHeight != 0) {
                ((BaseBundle)bundle).putInt("customContentHeight", mCustomContentHeight);
            }
            final int mGravity = this.mGravity;
            if (mGravity != 80) {
                ((BaseBundle)bundle).putInt("gravity", mGravity);
            }
            final int mHintScreenTimeout = this.mHintScreenTimeout;
            if (mHintScreenTimeout != 0) {
                ((BaseBundle)bundle).putInt("hintScreenTimeout", mHintScreenTimeout);
            }
            final String mDismissalId = this.mDismissalId;
            if (mDismissalId != null) {
                ((BaseBundle)bundle).putString("dismissalId", mDismissalId);
            }
            final String mBridgeTag = this.mBridgeTag;
            if (mBridgeTag != null) {
                ((BaseBundle)bundle).putString("bridgeTag", mBridgeTag);
            }
            notificationCompat$Builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return notificationCompat$Builder;
        }
        
        public List<NotificationCompat$Action> getActions() {
            return this.mActions;
        }
        
        @Deprecated
        public Bitmap getBackground() {
            return this.mBackground;
        }
        
        public String getBridgeTag() {
            return this.mBridgeTag;
        }
        
        public int getContentAction() {
            return this.mContentActionIndex;
        }
        
        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }
        
        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }
        
        public boolean getContentIntentAvailableOffline() {
            final int mFlags = this.mFlags;
            boolean b = true;
            if ((mFlags & 0x1) == 0x0) {
                b = false;
            }
            return b;
        }
        
        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }
        
        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }
        
        public String getDismissalId() {
            return this.mDismissalId;
        }
        
        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }
        
        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }
        
        @Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.mFlags & 0x20) != 0x0;
        }
        
        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.mFlags & 0x10) != 0x0;
        }
        
        public boolean getHintContentIntentLaunchesActivity() {
            return (this.mFlags & 0x40) != 0x0;
        }
        
        @Deprecated
        public boolean getHintHideIcon() {
            return (this.mFlags & 0x2) != 0x0;
        }
        
        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }
        
        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.mFlags & 0x4) != 0x0;
        }
        
        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }
        
        public boolean getStartScrollBottom() {
            return (this.mFlags & 0x8) != 0x0;
        }
        
        @Deprecated
        public WearableExtender setBackground(final Bitmap mBackground) {
            this.mBackground = mBackground;
            return this;
        }
        
        public WearableExtender setBridgeTag(final String mBridgeTag) {
            this.mBridgeTag = mBridgeTag;
            return this;
        }
        
        public WearableExtender setContentAction(final int mContentActionIndex) {
            this.mContentActionIndex = mContentActionIndex;
            return this;
        }
        
        @Deprecated
        public WearableExtender setContentIcon(final int mContentIcon) {
            this.mContentIcon = mContentIcon;
            return this;
        }
        
        @Deprecated
        public WearableExtender setContentIconGravity(final int mContentIconGravity) {
            this.mContentIconGravity = mContentIconGravity;
            return this;
        }
        
        public WearableExtender setContentIntentAvailableOffline(final boolean b) {
            this.setFlag(1, b);
            return this;
        }
        
        @Deprecated
        public WearableExtender setCustomContentHeight(final int mCustomContentHeight) {
            this.mCustomContentHeight = mCustomContentHeight;
            return this;
        }
        
        @Deprecated
        public WearableExtender setCustomSizePreset(final int mCustomSizePreset) {
            this.mCustomSizePreset = mCustomSizePreset;
            return this;
        }
        
        public WearableExtender setDismissalId(final String mDismissalId) {
            this.mDismissalId = mDismissalId;
            return this;
        }
        
        @Deprecated
        public WearableExtender setDisplayIntent(final PendingIntent mDisplayIntent) {
            this.mDisplayIntent = mDisplayIntent;
            return this;
        }
        
        @Deprecated
        public WearableExtender setGravity(final int mGravity) {
            this.mGravity = mGravity;
            return this;
        }
        
        @Deprecated
        public WearableExtender setHintAmbientBigPicture(final boolean b) {
            this.setFlag(32, b);
            return this;
        }
        
        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(final boolean b) {
            this.setFlag(16, b);
            return this;
        }
        
        public WearableExtender setHintContentIntentLaunchesActivity(final boolean b) {
            this.setFlag(64, b);
            return this;
        }
        
        @Deprecated
        public WearableExtender setHintHideIcon(final boolean b) {
            this.setFlag(2, b);
            return this;
        }
        
        @Deprecated
        public WearableExtender setHintScreenTimeout(final int mHintScreenTimeout) {
            this.mHintScreenTimeout = mHintScreenTimeout;
            return this;
        }
        
        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(final boolean b) {
            this.setFlag(4, b);
            return this;
        }
        
        public WearableExtender setStartScrollBottom(final boolean b) {
            this.setFlag(8, b);
            return this;
        }
    }
}
