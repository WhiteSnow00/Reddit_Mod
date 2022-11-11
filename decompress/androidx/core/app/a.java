// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import android.widget.RemoteViews;
import java.util.Set;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.drawable.Icon;
import java.util.Iterator;
import android.app.Notification;
import m3.h;
import androidx.appcompat.widget.l0;
import a4.f2;
import a4.e2;
import a4.x0;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Parcelable;
import java.util.Collection;
import j0.d;
import a4.c1;
import a4.r0;
import android.app.Notification$Action$Builder;
import androidx.core.graphics.drawable.IconCompat$a;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Notification$Builder;
import android.content.Context;

public final class a implements NotificationBuilderWithBuilderAccessor
{
    public final Context a;
    public final Notification$Builder b;
    public final NotificationCompat$Builder c;
    public final Bundle d;
    public int e;
    
    public a(final NotificationCompat$Builder c) {
        new ArrayList();
        this.d = new Bundle();
        this.c = c;
        this.a = c.mContext;
        if (Build$VERSION.SDK_INT >= 26) {
            this.b = new Notification$Builder(c.mContext, c.mChannelId);
        }
        else {
            this.b = new Notification$Builder(c.mContext);
        }
        final Notification mNotification = c.mNotification;
        this.b.setWhen(mNotification.when).setSmallIcon(mNotification.icon, mNotification.iconLevel).setContent(mNotification.contentView).setTicker(mNotification.tickerText, c.mTickerView).setVibrate(mNotification.vibrate).setLights(mNotification.ledARGB, mNotification.ledOnMS, mNotification.ledOffMS).setOngoing((mNotification.flags & 0x2) != 0x0).setOnlyAlertOnce((mNotification.flags & 0x8) != 0x0).setAutoCancel((mNotification.flags & 0x10) != 0x0).setDefaults(mNotification.defaults).setContentTitle(c.mContentTitle).setContentText(c.mContentText).setContentInfo(c.mContentInfo).setContentIntent(c.mContentIntent).setDeleteIntent(mNotification.deleteIntent).setFullScreenIntent(c.mFullScreenIntent, (mNotification.flags & 0x80) != 0x0).setLargeIcon(c.mLargeIcon).setNumber(c.mNumber).setProgress(c.mProgressMax, c.mProgress, c.mProgressIndeterminate);
        this.b.setSubText(c.mSubText).setUsesChronometer(c.mUseChronometer).setPriority(c.mPriority);
        final Iterator iterator = c.mActions.iterator();
        String s;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            s = "android.support.allowGeneratedReplies";
            Icon g = null;
            if (!hasNext) {
                break;
            }
            final NotificationCompat$Action notificationCompat$Action = (NotificationCompat$Action)iterator.next();
            final IconCompat iconCompat = notificationCompat$Action.getIconCompat();
            if (iconCompat != null) {
                g = IconCompat$a.g(iconCompat, (Context)null);
            }
            final Notification$Action$Builder notification$Action$Builder = new Notification$Action$Builder(g, notificationCompat$Action.getTitle(), notificationCompat$Action.getActionIntent());
            if (notificationCompat$Action.getRemoteInputs() != null) {
                final android.app.RemoteInput[] fromCompat = RemoteInput.fromCompat(notificationCompat$Action.getRemoteInputs());
                for (int length = fromCompat.length, i = 0; i < length; ++i) {
                    notification$Action$Builder.addRemoteInput(fromCompat[i]);
                }
            }
            Bundle bundle;
            if (notificationCompat$Action.getExtras() != null) {
                bundle = new Bundle(notificationCompat$Action.getExtras());
            }
            else {
                bundle = new Bundle();
            }
            ((BaseBundle)bundle).putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action.getAllowGeneratedReplies());
            final int sdk_INT = Build$VERSION.SDK_INT;
            notification$Action$Builder.setAllowGeneratedReplies(notificationCompat$Action.getAllowGeneratedReplies());
            ((BaseBundle)bundle).putInt("android.support.action.semanticAction", notificationCompat$Action.getSemanticAction());
            if (sdk_INT >= 28) {
                r0.b(notification$Action$Builder, notificationCompat$Action.getSemanticAction());
            }
            if (sdk_INT >= 29) {
                c1.f(notification$Action$Builder, notificationCompat$Action.isContextual());
            }
            if (sdk_INT >= 31) {
                g01.a.b(notification$Action$Builder, notificationCompat$Action.isAuthenticationRequired());
            }
            ((BaseBundle)bundle).putBoolean("android.support.action.showsUserInterface", notificationCompat$Action.getShowsUserInterface());
            notification$Action$Builder.addExtras(bundle);
            this.b.addAction(notification$Action$Builder.build());
        }
        final Bundle mExtras = c.mExtras;
        if (mExtras != null) {
            this.d.putAll(mExtras);
        }
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        this.b.setShowWhen(c.mShowWhen);
        this.b.setLocalOnly(c.mLocalOnly).setGroup(c.mGroupKey).setGroupSummary(c.mGroupSummary).setSortKey(c.mSortKey);
        this.e = c.mGroupAlertBehavior;
        this.b.setCategory(c.mCategory).setColor(c.mColor).setVisibility(c.mVisibility).setPublicVersion(c.mPublicVersion).setSound(mNotification.sound, mNotification.audioAttributes);
        ArrayList mPeople;
        if (sdk_INT2 < 28) {
            final ArrayList mPersonList = c.mPersonList;
            if (mPersonList == null) {
                mPeople = null;
            }
            else {
                final ArrayList list = new ArrayList(mPersonList.size());
                final Iterator iterator2 = mPersonList.iterator();
                while (true) {
                    mPeople = list;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    list.add((Object)((Person)iterator2.next()).resolveToLegacyUri());
                }
            }
            final ArrayList mPeople2 = c.mPeople;
            if (mPeople == null) {
                mPeople = mPeople2;
            }
            else if (mPeople2 != null) {
                final d d = new d(mPeople2.size() + mPeople.size());
                d.addAll((Collection)mPeople);
                d.addAll((Collection)mPeople2);
                mPeople = new ArrayList((Collection<? extends E>)d);
            }
        }
        else {
            mPeople = c.mPeople;
        }
        if (mPeople != null && !mPeople.isEmpty()) {
            final Iterator iterator3 = mPeople.iterator();
            while (iterator3.hasNext()) {
                this.b.addPerson((String)iterator3.next());
            }
        }
        Notification notification;
        if (c.mInvisibleActions.size() > 0) {
            Bundle bundle2;
            if ((bundle2 = c.getExtras().getBundle("android.car.EXTENSIONS")) == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle(bundle2);
            final Bundle bundle4 = new Bundle();
            int n = 0;
            notification = mNotification;
            while (true) {
                final Parcelable[] array = null;
                if (n >= c.mInvisibleActions.size()) {
                    break;
                }
                final String string = Integer.toString(n);
                final NotificationCompat$Action notificationCompat$Action2 = c.mInvisibleActions.get(n);
                final Object a = androidx.core.app.b.a;
                final Bundle bundle5 = new Bundle();
                final IconCompat iconCompat2 = notificationCompat$Action2.getIconCompat();
                int e;
                if (iconCompat2 != null) {
                    e = iconCompat2.e();
                }
                else {
                    e = 0;
                }
                ((BaseBundle)bundle5).putInt("icon", e);
                bundle5.putCharSequence("title", notificationCompat$Action2.getTitle());
                bundle5.putParcelable("actionIntent", (Parcelable)notificationCompat$Action2.getActionIntent());
                Bundle bundle6;
                if (notificationCompat$Action2.getExtras() != null) {
                    bundle6 = new Bundle(notificationCompat$Action2.getExtras());
                }
                else {
                    bundle6 = new Bundle();
                }
                ((BaseBundle)bundle6).putBoolean(s, notificationCompat$Action2.getAllowGeneratedReplies());
                bundle5.putBundle("extras", bundle6);
                final RemoteInput[] remoteInputs = notificationCompat$Action2.getRemoteInputs();
                Object[] array2;
                if (remoteInputs == null) {
                    array2 = array;
                }
                else {
                    final Bundle[] array3 = new Bundle[remoteInputs.length];
                    for (int j = 0; j < remoteInputs.length; ++j) {
                        final RemoteInput remoteInput = remoteInputs[j];
                        final Bundle bundle7 = new Bundle();
                        ((BaseBundle)bundle7).putString("resultKey", remoteInput.getResultKey());
                        bundle7.putCharSequence("label", remoteInput.getLabel());
                        bundle7.putCharSequenceArray("choices", remoteInput.getChoices());
                        ((BaseBundle)bundle7).putBoolean("allowFreeFormInput", remoteInput.getAllowFreeFormInput());
                        bundle7.putBundle("extras", remoteInput.getExtras());
                        final Set allowedDataTypes = remoteInput.getAllowedDataTypes();
                        if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
                            final ArrayList list2 = new ArrayList<String>(allowedDataTypes.size());
                            final Iterator iterator4 = allowedDataTypes.iterator();
                            while (iterator4.hasNext()) {
                                list2.add((String)iterator4.next());
                            }
                            bundle7.putStringArrayList("allowedDataTypes", list2);
                        }
                        array3[j] = bundle7;
                    }
                    array2 = array3;
                }
                bundle5.putParcelableArray("remoteInputs", (Parcelable[])array2);
                ((BaseBundle)bundle5).putBoolean("showsUserInterface", notificationCompat$Action2.getShowsUserInterface());
                ((BaseBundle)bundle5).putInt("semanticAction", notificationCompat$Action2.getSemanticAction());
                bundle4.putBundle(string, bundle5);
                ++n;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            c.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        else {
            notification = mNotification;
        }
        final int sdk_INT3 = Build$VERSION.SDK_INT;
        final Icon mSmallIcon = c.mSmallIcon;
        if (mSmallIcon != null) {
            this.b.setSmallIcon(mSmallIcon);
        }
        this.b.setExtras(c.mExtras).setRemoteInputHistory(c.mRemoteInputHistory);
        final RemoteViews mContentView = c.mContentView;
        if (mContentView != null) {
            this.b.setCustomContentView(mContentView);
        }
        final RemoteViews mBigContentView = c.mBigContentView;
        if (mBigContentView != null) {
            this.b.setCustomBigContentView(mBigContentView);
        }
        final RemoteViews mHeadsUpContentView = c.mHeadsUpContentView;
        if (mHeadsUpContentView != null) {
            this.b.setCustomHeadsUpContentView(mHeadsUpContentView);
        }
        if (sdk_INT3 >= 26) {
            this.b.setBadgeIconType(c.mBadgeIcon).setSettingsText(c.mSettingsText).setShortcutId(c.mShortcutId).setTimeoutAfter(c.mTimeout).setGroupAlertBehavior(c.mGroupAlertBehavior);
            if (c.mColorizedSet) {
                this.b.setColorized(c.mColorized);
            }
            if (!TextUtils.isEmpty((CharSequence)c.mChannelId)) {
                this.b.setSound((Uri)null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[])null);
            }
        }
        if (sdk_INT3 >= 28) {
            final Iterator iterator5 = c.mPersonList.iterator();
            while (iterator5.hasNext()) {
                x0.c(this.b, ((Person)iterator5.next()).toAndroidPerson());
            }
        }
        final int sdk_INT4 = Build$VERSION.SDK_INT;
        if (sdk_INT4 >= 29) {
            e2.f(this.b, c.mAllowSystemGeneratedContextualActions);
            f2.d(this.b, NotificationCompat$BubbleMetadata.toPlatform(c.mBubbleMetadata));
            final n3.b mLocusId = c.mLocusId;
            if (mLocusId != null) {
                l0.c(this.b, mLocusId.b);
            }
        }
        if (sdk_INT4 >= 31) {
            final int mFgsDeferBehavior = c.mFgsDeferBehavior;
            if (mFgsDeferBehavior != 0) {
                h.a(this.b, mFgsDeferBehavior);
            }
        }
        if (c.mSilent) {
            if (this.c.mGroupSummary) {
                this.e = 2;
            }
            else {
                this.e = 1;
            }
            this.b.setVibrate((long[])null);
            this.b.setSound((Uri)null);
            final int n2 = notification.defaults & 0xFFFFFFFE & 0xFFFFFFFD;
            notification.defaults = n2;
            this.b.setDefaults(n2);
            if (sdk_INT4 >= 26) {
                if (TextUtils.isEmpty((CharSequence)this.c.mGroupKey)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.e);
            }
        }
    }
    
    public final Notification a() {
        final NotificationCompat$Style mStyle = this.c.mStyle;
        if (mStyle != null) {
            mStyle.apply((NotificationBuilderWithBuilderAccessor)this);
        }
        RemoteViews contentView;
        if (mStyle != null) {
            contentView = mStyle.makeContentView((NotificationBuilderWithBuilderAccessor)this);
        }
        else {
            contentView = null;
        }
        Notification notification;
        if (Build$VERSION.SDK_INT >= 26) {
            notification = this.b.build();
        }
        else {
            notification = this.b.build();
            if (this.e != 0) {
                if (notification.getGroup() != null && (notification.flags & 0x200) != 0x0 && this.e == 2) {
                    notification.sound = null;
                    notification.vibrate = null;
                    notification.defaults = (notification.defaults & 0xFFFFFFFE & 0xFFFFFFFD);
                }
                if (notification.getGroup() != null && (notification.flags & 0x200) == 0x0 && this.e == 1) {
                    notification.sound = null;
                    notification.vibrate = null;
                    notification.defaults = (notification.defaults & 0xFFFFFFFE & 0xFFFFFFFD);
                }
            }
        }
        if (contentView != null) {
            notification.contentView = contentView;
        }
        else {
            final RemoteViews mContentView = this.c.mContentView;
            if (mContentView != null) {
                notification.contentView = mContentView;
            }
        }
        if (mStyle != null) {
            final RemoteViews bigContentView = mStyle.makeBigContentView((NotificationBuilderWithBuilderAccessor)this);
            if (bigContentView != null) {
                notification.bigContentView = bigContentView;
            }
        }
        if (mStyle != null) {
            final RemoteViews headsUpContentView = this.c.mStyle.makeHeadsUpContentView((NotificationBuilderWithBuilderAccessor)this);
            if (headsUpContentView != null) {
                notification.headsUpContentView = headsUpContentView;
            }
        }
        if (mStyle != null) {
            final Bundle extras = NotificationCompat.getExtras(notification);
            if (extras != null) {
                mStyle.addCompatExtras(extras);
            }
        }
        return notification;
    }
    
    public final Notification$Builder getBuilder() {
        return this.b;
    }
}
