// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.content.ClipData;
import android.content.ClipData$Item;
import android.text.Spanned;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.os.Parcelable;
import android.content.ContextWrapper;
import android.net.Uri;
import android.content.Context;
import java.util.ArrayList;
import android.content.Intent;
import android.content.ComponentName;
import android.app.Activity;
import android.view.ActionProvider;
import android.widget.ShareActionProvider;
import android.view.MenuItem;
import ak0.n;
import android.view.Menu;

public final class ShareCompat
{
    public static final String EXTRA_CALLING_ACTIVITY = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_ACTIVITY_INTEROP = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "androidx.core.app.EXTRA_CALLING_PACKAGE";
    public static final String EXTRA_CALLING_PACKAGE_INTEROP = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static final String HISTORY_FILENAME_PREFIX = ".sharecompat_";
    
    private ShareCompat() {
    }
    
    @Deprecated
    public static void configureMenuItem(final Menu menu, final int n, final IntentBuilder intentBuilder) {
        final MenuItem item = menu.findItem(n);
        if (item != null) {
            configureMenuItem(item, intentBuilder);
            return;
        }
        throw new IllegalArgumentException(n.l("Could not find menu item with id ", n, " in the supplied menu"));
    }
    
    @Deprecated
    public static void configureMenuItem(final MenuItem menuItem, final IntentBuilder intentBuilder) {
        final ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider actionProvider2;
        if (!(actionProvider instanceof ShareActionProvider)) {
            actionProvider2 = new ShareActionProvider(intentBuilder.getContext());
        }
        else {
            actionProvider2 = (ShareActionProvider)actionProvider;
        }
        final StringBuilder k = a.k(".sharecompat_");
        k.append(intentBuilder.getContext().getClass().getName());
        actionProvider2.setShareHistoryFileName(k.toString());
        actionProvider2.setShareIntent(intentBuilder.getIntent());
        menuItem.setActionProvider((ActionProvider)actionProvider2);
    }
    
    public static ComponentName getCallingActivity(final Activity activity) {
        final Intent intent = activity.getIntent();
        ComponentName componentName;
        if ((componentName = activity.getCallingActivity()) == null) {
            componentName = getCallingActivity(intent);
        }
        return componentName;
    }
    
    public static ComponentName getCallingActivity(final Intent intent) {
        ComponentName componentName;
        if ((componentName = (ComponentName)intent.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY")) == null) {
            componentName = (ComponentName)intent.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
        }
        return componentName;
    }
    
    public static String getCallingPackage(final Activity activity) {
        final Intent intent = activity.getIntent();
        String s2;
        final String s = s2 = activity.getCallingPackage();
        if (s == null) {
            s2 = s;
            if (intent != null) {
                s2 = getCallingPackage(intent);
            }
        }
        return s2;
    }
    
    public static String getCallingPackage(final Intent intent) {
        String s;
        if ((s = intent.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE")) == null) {
            s = intent.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
        }
        return s;
    }
    
    public static class IntentBuilder
    {
        private ArrayList<String> mBccAddresses;
        private ArrayList<String> mCcAddresses;
        private CharSequence mChooserTitle;
        private final Context mContext;
        private final Intent mIntent;
        private ArrayList<Uri> mStreams;
        private ArrayList<String> mToAddresses;
        
        public IntentBuilder(Context baseContext) {
            baseContext.getClass();
            this.mContext = baseContext;
            final Intent setAction = new Intent().setAction("android.intent.action.SEND");
            (this.mIntent = setAction).putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", baseContext.getPackageName());
            setAction.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", baseContext.getPackageName());
            setAction.addFlags(524288);
            final Activity activity = null;
            Activity activity2;
            while (true) {
                activity2 = activity;
                if (!(baseContext instanceof ContextWrapper)) {
                    break;
                }
                if (baseContext instanceof Activity) {
                    activity2 = (Activity)baseContext;
                    break;
                }
                baseContext = ((ContextWrapper)baseContext).getBaseContext();
            }
            if (activity2 != null) {
                final ComponentName componentName = activity2.getComponentName();
                this.mIntent.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", (Parcelable)componentName);
                this.mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", (Parcelable)componentName);
            }
        }
        
        private void combineArrayExtra(final String s, final ArrayList<String> list) {
            final String[] stringArrayExtra = this.mIntent.getStringArrayExtra(s);
            int length;
            if (stringArrayExtra != null) {
                length = stringArrayExtra.length;
            }
            else {
                length = 0;
            }
            final String[] array = new String[list.size() + length];
            list.toArray(array);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, array, list.size(), length);
            }
            this.mIntent.putExtra(s, array);
        }
        
        private void combineArrayExtra(final String s, final String[] array) {
            final Intent intent = this.getIntent();
            final String[] stringArrayExtra = intent.getStringArrayExtra(s);
            int length;
            if (stringArrayExtra != null) {
                length = stringArrayExtra.length;
            }
            else {
                length = 0;
            }
            final String[] array2 = new String[array.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, array2, 0, length);
            }
            System.arraycopy(array, 0, array2, length, array.length);
            intent.putExtra(s, array2);
        }
        
        @Deprecated
        public static IntentBuilder from(final Activity activity) {
            return new IntentBuilder((Context)activity);
        }
        
        public IntentBuilder addEmailBcc(final String s) {
            if (this.mBccAddresses == null) {
                this.mBccAddresses = new ArrayList<String>();
            }
            this.mBccAddresses.add(s);
            return this;
        }
        
        public IntentBuilder addEmailBcc(final String[] array) {
            this.combineArrayExtra("android.intent.extra.BCC", array);
            return this;
        }
        
        public IntentBuilder addEmailCc(final String s) {
            if (this.mCcAddresses == null) {
                this.mCcAddresses = new ArrayList<String>();
            }
            this.mCcAddresses.add(s);
            return this;
        }
        
        public IntentBuilder addEmailCc(final String[] array) {
            this.combineArrayExtra("android.intent.extra.CC", array);
            return this;
        }
        
        public IntentBuilder addEmailTo(final String s) {
            if (this.mToAddresses == null) {
                this.mToAddresses = new ArrayList<String>();
            }
            this.mToAddresses.add(s);
            return this;
        }
        
        public IntentBuilder addEmailTo(final String[] array) {
            this.combineArrayExtra("android.intent.extra.EMAIL", array);
            return this;
        }
        
        public IntentBuilder addStream(final Uri uri) {
            if (this.mStreams == null) {
                this.mStreams = new ArrayList<Uri>();
            }
            this.mStreams.add(uri);
            return this;
        }
        
        public Intent createChooserIntent() {
            return Intent.createChooser(this.getIntent(), this.mChooserTitle);
        }
        
        public Context getContext() {
            return this.mContext;
        }
        
        public Intent getIntent() {
            final ArrayList<String> mToAddresses = this.mToAddresses;
            if (mToAddresses != null) {
                this.combineArrayExtra("android.intent.extra.EMAIL", mToAddresses);
                this.mToAddresses = null;
            }
            final ArrayList<String> mCcAddresses = this.mCcAddresses;
            if (mCcAddresses != null) {
                this.combineArrayExtra("android.intent.extra.CC", mCcAddresses);
                this.mCcAddresses = null;
            }
            final ArrayList<String> mBccAddresses = this.mBccAddresses;
            if (mBccAddresses != null) {
                this.combineArrayExtra("android.intent.extra.BCC", mBccAddresses);
                this.mBccAddresses = null;
            }
            final ArrayList<Uri> mStreams = this.mStreams;
            boolean b = true;
            if (mStreams == null || mStreams.size() <= 1) {
                b = false;
            }
            if (!b) {
                this.mIntent.setAction("android.intent.action.SEND");
                final ArrayList<Uri> mStreams2 = this.mStreams;
                if (mStreams2 != null && !mStreams2.isEmpty()) {
                    this.mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)this.mStreams.get(0));
                    a.b(this.mIntent, this.mStreams);
                }
                else {
                    this.mIntent.removeExtra("android.intent.extra.STREAM");
                    a.c(this.mIntent);
                }
            }
            else {
                this.mIntent.setAction("android.intent.action.SEND_MULTIPLE");
                this.mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList)this.mStreams);
                a.b(this.mIntent, this.mStreams);
            }
            return this.mIntent;
        }
        
        public IntentBuilder setChooserTitle(final int n) {
            return this.setChooserTitle(this.mContext.getText(n));
        }
        
        public IntentBuilder setChooserTitle(final CharSequence mChooserTitle) {
            this.mChooserTitle = mChooserTitle;
            return this;
        }
        
        public IntentBuilder setEmailBcc(final String[] array) {
            this.mIntent.putExtra("android.intent.extra.BCC", array);
            return this;
        }
        
        public IntentBuilder setEmailCc(final String[] array) {
            this.mIntent.putExtra("android.intent.extra.CC", array);
            return this;
        }
        
        public IntentBuilder setEmailTo(final String[] array) {
            if (this.mToAddresses != null) {
                this.mToAddresses = null;
            }
            this.mIntent.putExtra("android.intent.extra.EMAIL", array);
            return this;
        }
        
        public IntentBuilder setHtmlText(final String s) {
            this.mIntent.putExtra("android.intent.extra.HTML_TEXT", s);
            if (!this.mIntent.hasExtra("android.intent.extra.TEXT")) {
                this.setText((CharSequence)Html.fromHtml(s));
            }
            return this;
        }
        
        public IntentBuilder setStream(final Uri uri) {
            this.mStreams = null;
            if (uri != null) {
                this.addStream(uri);
            }
            return this;
        }
        
        public IntentBuilder setSubject(final String s) {
            this.mIntent.putExtra("android.intent.extra.SUBJECT", s);
            return this;
        }
        
        public IntentBuilder setText(final CharSequence charSequence) {
            this.mIntent.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }
        
        public IntentBuilder setType(final String type) {
            this.mIntent.setType(type);
            return this;
        }
        
        public void startChooser() {
            this.mContext.startActivity(this.createChooserIntent());
        }
    }
    
    public static class IntentReader
    {
        private static final String TAG = "IntentReader";
        private final ComponentName mCallingActivity;
        private final String mCallingPackage;
        private final Context mContext;
        private final Intent mIntent;
        private ArrayList<Uri> mStreams;
        
        public IntentReader(final Activity activity) {
            activity.getClass();
            this((Context)activity, activity.getIntent());
        }
        
        public IntentReader(final Context mContext, final Intent mIntent) {
            mContext.getClass();
            this.mContext = mContext;
            mIntent.getClass();
            this.mIntent = mIntent;
            this.mCallingPackage = ShareCompat.getCallingPackage(mIntent);
            this.mCallingActivity = ShareCompat.getCallingActivity(mIntent);
        }
        
        @Deprecated
        public static IntentReader from(final Activity activity) {
            return new IntentReader(activity);
        }
        
        private static void withinStyle(final StringBuilder sb, final CharSequence charSequence, int i, final int n) {
            while (i < n) {
                final char char1 = charSequence.charAt(i);
                if (char1 == '<') {
                    sb.append("&lt;");
                }
                else if (char1 == '>') {
                    sb.append("&gt;");
                }
                else if (char1 == '&') {
                    sb.append("&amp;");
                }
                else if (char1 <= '~' && char1 >= ' ') {
                    if (char1 == ' ') {
                        while (true) {
                            final int n2 = i + 1;
                            if (n2 >= n || charSequence.charAt(n2) != ' ') {
                                break;
                            }
                            sb.append("&nbsp;");
                            i = n2;
                        }
                        sb.append(' ');
                    }
                    else {
                        sb.append(char1);
                    }
                }
                else {
                    sb.append("&#");
                    sb.append((int)char1);
                    sb.append(";");
                }
                ++i;
            }
        }
        
        public ComponentName getCallingActivity() {
            return this.mCallingActivity;
        }
        
        public Drawable getCallingActivityIcon() {
            if (this.mCallingActivity == null) {
                return null;
            }
            final PackageManager packageManager = this.mContext.getPackageManager();
            try {
                return packageManager.getActivityIcon(this.mCallingActivity);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.e("IntentReader", "Could not retrieve icon for calling activity", (Throwable)ex);
                return null;
            }
        }
        
        public Drawable getCallingApplicationIcon() {
            if (this.mCallingPackage == null) {
                return null;
            }
            final PackageManager packageManager = this.mContext.getPackageManager();
            try {
                return packageManager.getApplicationIcon(this.mCallingPackage);
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.e("IntentReader", "Could not retrieve icon for calling application", (Throwable)ex);
                return null;
            }
        }
        
        public CharSequence getCallingApplicationLabel() {
            if (this.mCallingPackage == null) {
                return null;
            }
            final PackageManager packageManager = this.mContext.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.mCallingPackage, 0));
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.e("IntentReader", "Could not retrieve label for calling application", (Throwable)ex);
                return null;
            }
        }
        
        public String getCallingPackage() {
            return this.mCallingPackage;
        }
        
        public String[] getEmailBcc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.BCC");
        }
        
        public String[] getEmailCc() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.CC");
        }
        
        public String[] getEmailTo() {
            return this.mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
        }
        
        public String getHtmlText() {
            String s2;
            final String s = s2 = this.mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
            if (s == null) {
                final CharSequence text = this.getText();
                if (text instanceof Spanned) {
                    s2 = Html.toHtml((Spanned)text);
                }
                else {
                    s2 = s;
                    if (text != null) {
                        s2 = a.a(text);
                    }
                }
            }
            return s2;
        }
        
        public Uri getStream() {
            return (Uri)this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
        }
        
        public Uri getStream(final int n) {
            if (this.mStreams == null && this.isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            final ArrayList<Uri> mStreams = this.mStreams;
            if (mStreams != null) {
                return mStreams.get(n);
            }
            if (n == 0) {
                return (Uri)this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
            }
            final StringBuilder k = a.k("Stream items available: ");
            k.append(this.getStreamCount());
            k.append(" index requested: ");
            k.append(n);
            throw new IndexOutOfBoundsException(k.toString());
        }
        
        public int getStreamCount() {
            if (this.mStreams == null && this.isMultipleShare()) {
                this.mStreams = this.mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            final ArrayList<Uri> mStreams = this.mStreams;
            if (mStreams != null) {
                return mStreams.size();
            }
            return this.mIntent.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }
        
        public String getSubject() {
            return this.mIntent.getStringExtra("android.intent.extra.SUBJECT");
        }
        
        public CharSequence getText() {
            return this.mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
        }
        
        public String getType() {
            return this.mIntent.getType();
        }
        
        public boolean isMultipleShare() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.mIntent.getAction());
        }
        
        public boolean isShareIntent() {
            final String action = this.mIntent.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }
        
        public boolean isSingleShare() {
            return "android.intent.action.SEND".equals(this.mIntent.getAction());
        }
    }
    
    public static final class a
    {
        public static String a(final CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }
        
        public static void b(final Intent intent, final ArrayList<Uri> list) {
            final ClipData clipData = new ClipData((CharSequence)null, new String[] { intent.getType() }, new ClipData$Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent)null, (Uri)list.get(0)));
            for (int size = list.size(), i = 1; i < size; ++i) {
                clipData.addItem(new ClipData$Item((Uri)list.get(i)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }
        
        public static void c(final Intent intent) {
            intent.setClipData((ClipData)null);
            intent.setFlags(intent.getFlags() & 0xFFFFFFFE);
        }
    }
}
