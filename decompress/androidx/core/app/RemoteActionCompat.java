// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import a4.t0;
import a4.u0;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Icon;
import android.os.Build$VERSION;
import android.app.RemoteAction;
import androidx.core.graphics.drawable.IconCompat;
import android.app.PendingIntent;
import w5.c;

public final class RemoteActionCompat implements c
{
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;
    
    public RemoteActionCompat() {
    }
    
    public RemoteActionCompat(final RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }
    
    public RemoteActionCompat(final IconCompat mIcon, final CharSequence mTitle, final CharSequence mContentDescription, final PendingIntent mActionIntent) {
        mIcon.getClass();
        this.mIcon = mIcon;
        mTitle.getClass();
        this.mTitle = mTitle;
        mContentDescription.getClass();
        this.mContentDescription = mContentDescription;
        mActionIntent.getClass();
        this.mActionIntent = mActionIntent;
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }
    
    public static RemoteActionCompat createFromRemoteAction(final RemoteAction remoteAction) {
        remoteAction.getClass();
        final Icon d = a.d(remoteAction);
        final PorterDuff$Mode k = IconCompat.k;
        final RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.a.a(d), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.setEnabled(a.f(remoteAction));
        if (Build$VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(b.b(remoteAction));
        }
        return remoteActionCompat;
    }
    
    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }
    
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }
    
    public IconCompat getIcon() {
        return this.mIcon;
    }
    
    public CharSequence getTitle() {
        return this.mTitle;
    }
    
    public boolean isEnabled() {
        return this.mEnabled;
    }
    
    public void setEnabled(final boolean mEnabled) {
        this.mEnabled = mEnabled;
    }
    
    public void setShouldShowIcon(final boolean mShouldShowIcon) {
        this.mShouldShowIcon = mShouldShowIcon;
    }
    
    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }
    
    public RemoteAction toRemoteAction() {
        final IconCompat mIcon = this.mIcon;
        mIcon.getClass();
        final RemoteAction a = RemoteActionCompat.a.a(IconCompat.a.g(mIcon, null), this.mTitle, this.mContentDescription, this.mActionIntent);
        RemoteActionCompat.a.g(a, this.isEnabled());
        if (Build$VERSION.SDK_INT >= 28) {
            b.a(a, this.shouldShowIcon());
        }
        return a;
    }
    
    public static final class a
    {
        public static RemoteAction a(final Icon icon, final CharSequence charSequence, final CharSequence charSequence2, final PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }
        
        public static PendingIntent b(final RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }
        
        public static CharSequence c(final RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }
        
        public static Icon d(final RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }
        
        public static CharSequence e(final RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }
        
        public static boolean f(final RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }
        
        public static void g(final RemoteAction remoteAction, final boolean enabled) {
            remoteAction.setEnabled(enabled);
        }
    }
    
    public static final class b
    {
        public static void a(final RemoteAction remoteAction, final boolean b) {
            u0.e(remoteAction, b);
        }
        
        public static boolean b(final RemoteAction remoteAction) {
            return t0.i(remoteAction);
        }
    }
}
