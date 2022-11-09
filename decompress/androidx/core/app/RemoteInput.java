// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import a4.b1;
import a4.c2;
import androidx.compose.ui.platform.r;
import a4.q0;
import a4.w;
import a4.v;
import a4.u;
import a4.t;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.util.HashSet;
import ak0.m;
import java.util.HashMap;
import android.content.ClipDescription;
import android.app.RemoteInput$Builder;
import java.util.Iterator;
import android.content.ClipData;
import android.os.Build$VERSION;
import android.net.Uri;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

public final class RemoteInput
{
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    private static final String EXTRA_DATA_TYPE_RESULTS_DATA = "android.remoteinput.dataTypeResultsData";
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    private static final String EXTRA_RESULTS_SOURCE = "android.remoteinput.resultsSource";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;
    private final boolean mAllowFreeFormTextInput;
    private final Set<String> mAllowedDataTypes;
    private final CharSequence[] mChoices;
    private final int mEditChoicesBeforeSending;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;
    
    public RemoteInput(final String mResultKey, final CharSequence mLabel, final CharSequence[] mChoices, final boolean mAllowFreeFormTextInput, final int mEditChoicesBeforeSending, final Bundle mExtras, final Set<String> mAllowedDataTypes) {
        this.mResultKey = mResultKey;
        this.mLabel = mLabel;
        this.mChoices = mChoices;
        this.mAllowFreeFormTextInput = mAllowFreeFormTextInput;
        this.mEditChoicesBeforeSending = mEditChoicesBeforeSending;
        this.mExtras = mExtras;
        this.mAllowedDataTypes = mAllowedDataTypes;
        if (this.getEditChoicesBeforeSending() == 2 && !this.getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }
    
    public static void addDataResultToIntent(final RemoteInput remoteInput, final Intent intent, final Map<String, Uri> map) {
        if (Build$VERSION.SDK_INT >= 26) {
            c.a(remoteInput, intent, map);
        }
        else {
            Intent clipDataIntentFromIntent;
            if ((clipDataIntentFromIntent = getClipDataIntentFromIntent(intent)) == null) {
                clipDataIntentFromIntent = new Intent();
            }
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                final String s = entry.getKey();
                final Uri uri = (Uri)entry.getValue();
                if (s == null) {
                    continue;
                }
                Bundle bundleExtra;
                if ((bundleExtra = clipDataIntentFromIntent.getBundleExtra(getExtraResultsKeyForData(s))) == null) {
                    bundleExtra = new Bundle();
                }
                ((BaseBundle)bundleExtra).putString(remoteInput.getResultKey(), uri.toString());
                clipDataIntentFromIntent.putExtra(getExtraResultsKeyForData(s), bundleExtra);
            }
            a.b(intent, ClipData.newIntent((CharSequence)"android.remoteinput.results", clipDataIntentFromIntent));
        }
    }
    
    public static void addResultsToIntent(final RemoteInput[] array, final Intent intent, Bundle bundle) {
        if (Build$VERSION.SDK_INT >= 26) {
            b.a(fromCompat(array), intent, bundle);
        }
        else {
            final Bundle resultsFromIntent = getResultsFromIntent(intent);
            final int resultsSource = getResultsSource(intent);
            if (resultsFromIntent != null) {
                resultsFromIntent.putAll(bundle);
                bundle = resultsFromIntent;
            }
            for (final RemoteInput remoteInput : array) {
                final Map<String, Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, remoteInput.getResultKey());
                b.a(fromCompat(new RemoteInput[] { remoteInput }), intent, bundle);
                if (dataResultsFromIntent != null) {
                    addDataResultToIntent(remoteInput, intent, dataResultsFromIntent);
                }
            }
            setResultsSource(intent, resultsSource);
        }
    }
    
    public static android.app.RemoteInput fromCompat(final RemoteInput remoteInput) {
        final RemoteInput$Builder addExtras = new RemoteInput$Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
        if (Build$VERSION.SDK_INT >= 26) {
            final Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
            if (allowedDataTypes != null) {
                final Iterator<String> iterator = allowedDataTypes.iterator();
                while (iterator.hasNext()) {
                    c.d(addExtras, iterator.next(), true);
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 29) {
            e.b(addExtras, remoteInput.getEditChoicesBeforeSending());
        }
        return addExtras.build();
    }
    
    public static android.app.RemoteInput[] fromCompat(final RemoteInput[] array) {
        if (array == null) {
            return null;
        }
        final android.app.RemoteInput[] array2 = new android.app.RemoteInput[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = fromCompat(array[i]);
        }
        return array2;
    }
    
    public static RemoteInput fromPlatform(final android.app.RemoteInput remoteInput) {
        final Builder addExtras = new Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
        if (Build$VERSION.SDK_INT >= 26) {
            final Set<String> b = c.b(remoteInput);
            if (b != null) {
                final Iterator<String> iterator = b.iterator();
                while (iterator.hasNext()) {
                    addExtras.setAllowDataType(iterator.next(), true);
                }
            }
        }
        if (Build$VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(e.a(remoteInput));
        }
        return addExtras.build();
    }
    
    private static Intent getClipDataIntentFromIntent(final Intent intent) {
        final ClipData a = RemoteInput.a.a(intent);
        if (a == null) {
            return null;
        }
        final ClipDescription description = a.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent")) {
            return null;
        }
        if (!description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return null;
        }
        return a.getItemAt(0).getIntent();
    }
    
    public static Map<String, Uri> getDataResultsFromIntent(final Intent intent, final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            return c.c(intent, s);
        }
        final Intent clipDataIntentFromIntent = getClipDataIntentFromIntent(intent);
        Map<String, Uri> map = null;
        if (clipDataIntentFromIntent == null) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        for (final String s2 : ((BaseBundle)clipDataIntentFromIntent.getExtras()).keySet()) {
            if (s2.startsWith("android.remoteinput.dataTypeResultsData")) {
                final String substring = s2.substring(39);
                if (substring.isEmpty()) {
                    continue;
                }
                final String string = ((BaseBundle)clipDataIntentFromIntent.getBundleExtra(s2)).getString(s);
                if (string == null) {
                    continue;
                }
                if (string.isEmpty()) {
                    continue;
                }
                hashMap.put(substring, Uri.parse(string));
            }
        }
        if (!hashMap.isEmpty()) {
            map = hashMap;
        }
        return map;
    }
    
    private static String getExtraResultsKeyForData(final String s) {
        return m.l("android.remoteinput.dataTypeResultsData", s);
    }
    
    public static Bundle getResultsFromIntent(final Intent intent) {
        return b.b(intent);
    }
    
    public static int getResultsSource(Intent clipDataIntentFromIntent) {
        if (Build$VERSION.SDK_INT >= 28) {
            return d.a(clipDataIntentFromIntent);
        }
        clipDataIntentFromIntent = getClipDataIntentFromIntent(clipDataIntentFromIntent);
        if (clipDataIntentFromIntent == null) {
            return 0;
        }
        return ((BaseBundle)clipDataIntentFromIntent.getExtras()).getInt("android.remoteinput.resultsSource", 0);
    }
    
    public static void setResultsSource(final Intent intent, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            d.b(intent, n);
        }
        else {
            Intent clipDataIntentFromIntent;
            if ((clipDataIntentFromIntent = getClipDataIntentFromIntent(intent)) == null) {
                clipDataIntentFromIntent = new Intent();
            }
            clipDataIntentFromIntent.putExtra("android.remoteinput.resultsSource", n);
            a.b(intent, ClipData.newIntent((CharSequence)"android.remoteinput.results", clipDataIntentFromIntent));
        }
    }
    
    public boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormTextInput;
    }
    
    public Set<String> getAllowedDataTypes() {
        return this.mAllowedDataTypes;
    }
    
    public CharSequence[] getChoices() {
        return this.mChoices;
    }
    
    public int getEditChoicesBeforeSending() {
        return this.mEditChoicesBeforeSending;
    }
    
    public Bundle getExtras() {
        return this.mExtras;
    }
    
    public CharSequence getLabel() {
        return this.mLabel;
    }
    
    public String getResultKey() {
        return this.mResultKey;
    }
    
    public boolean isDataOnly() {
        return !this.getAllowFreeFormInput() && (this.getChoices() == null || this.getChoices().length == 0) && this.getAllowedDataTypes() != null && !this.getAllowedDataTypes().isEmpty();
    }
    
    public static final class Builder
    {
        private boolean mAllowFreeFormTextInput;
        private final Set<String> mAllowedDataTypes;
        private CharSequence[] mChoices;
        private int mEditChoicesBeforeSending;
        private final Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;
        
        public Builder(final String mResultKey) {
            this.mAllowedDataTypes = new HashSet<String>();
            this.mExtras = new Bundle();
            this.mAllowFreeFormTextInput = true;
            this.mEditChoicesBeforeSending = 0;
            if (mResultKey != null) {
                this.mResultKey = mResultKey;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }
        
        public Builder addExtras(final Bundle bundle) {
            if (bundle != null) {
                this.mExtras.putAll(bundle);
            }
            return this;
        }
        
        public RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormTextInput, this.mEditChoicesBeforeSending, this.mExtras, this.mAllowedDataTypes);
        }
        
        public Bundle getExtras() {
            return this.mExtras;
        }
        
        public Builder setAllowDataType(final String s, final boolean b) {
            if (b) {
                this.mAllowedDataTypes.add(s);
            }
            else {
                this.mAllowedDataTypes.remove(s);
            }
            return this;
        }
        
        public Builder setAllowFreeFormInput(final boolean mAllowFreeFormTextInput) {
            this.mAllowFreeFormTextInput = mAllowFreeFormTextInput;
            return this;
        }
        
        public Builder setChoices(final CharSequence[] mChoices) {
            this.mChoices = mChoices;
            return this;
        }
        
        public Builder setEditChoicesBeforeSending(final int mEditChoicesBeforeSending) {
            this.mEditChoicesBeforeSending = mEditChoicesBeforeSending;
            return this;
        }
        
        public Builder setLabel(final CharSequence mLabel) {
            this.mLabel = mLabel;
            return this;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface EditChoicesBeforeSending {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }
    
    public static final class a
    {
        public static ClipData a(final Intent intent) {
            return intent.getClipData();
        }
        
        public static void b(final Intent intent, final ClipData clipData) {
            intent.setClipData(clipData);
        }
    }
    
    public static final class b
    {
        public static void a(final Object o, final Intent intent, final Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[])o, intent, bundle);
        }
        
        public static Bundle b(final Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }
    
    public static final class c
    {
        public static void a(final RemoteInput remoteInput, final Intent intent, final Map<String, Uri> map) {
            t.g(RemoteInput.fromCompat(remoteInput), intent, (Map)map);
        }
        
        public static Set<String> b(final Object o) {
            return u.f((android.app.RemoteInput)o);
        }
        
        public static Map<String, Uri> c(final Intent intent, final String s) {
            return v.c(intent, s);
        }
        
        public static RemoteInput$Builder d(final RemoteInput$Builder remoteInput$Builder, final String s, final boolean b) {
            return w.c(remoteInput$Builder, s, b);
        }
    }
    
    public static final class d
    {
        public static int a(final Intent intent) {
            return q0.a(intent);
        }
        
        public static void b(final Intent intent, final int n) {
            r.c(n, intent);
        }
    }
    
    public static final class e
    {
        public static int a(final Object o) {
            return c2.a((android.app.RemoteInput)o);
        }
        
        public static RemoteInput$Builder b(final RemoteInput$Builder remoteInput$Builder, final int n) {
            return b1.c(remoteInput$Builder, n);
        }
    }
}
