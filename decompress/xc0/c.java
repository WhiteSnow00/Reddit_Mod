// 
// Decompiled by Procyon v0.6.0
// 

package xc0;

import android.os.Parcel;
import p1.h;
import java.util.Arrays;
import ng2.e;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class c implements Parcelable
{
    public static final Parcelable$Creator<c> CREATOR;
    public static final c j;
    public final String[] f;
    public final String[] g;
    public final String[] h;
    public final String[] i;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
        j = new c(new String[0], new String[0], new String[0], new String[0]);
    }
    
    public c(final String[] f, final String[] g, final String[] h, final String[] i) {
        e.f((Object)f, "interestTopicIds");
        e.f((Object)g, "interestRawTopicIds");
        e.f((Object)h, "selectedPrefixedSubredditNames");
        e.f((Object)i, "unselectedPrefixedSubredditNames");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!e.a((Object)c.class, (Object)class1)) {
            return false;
        }
        e.d(o, "null cannot be cast to non-null type com.reddit.domain.onboardingtopic.model.OnboardingCompletionData");
        final c c = (c)o;
        return Arrays.equals(this.f, c.f) && Arrays.equals(this.g, c.g) && Arrays.equals(this.h, c.h) && Arrays.equals(this.i, c.i);
    }
    
    @Override
    public final int hashCode() {
        return ((Arrays.hashCode(this.f) * 31 + Arrays.hashCode(this.g)) * 31 + Arrays.hashCode(this.h)) * 31 + Arrays.hashCode(this.i);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("OnboardingCompletionData(interestTopicIds=");
        t.append(Arrays.toString(this.f));
        t.append(", interestRawTopicIds=");
        t.append(Arrays.toString(this.g));
        t.append(", selectedPrefixedSubredditNames=");
        t.append(Arrays.toString(this.h));
        t.append(", unselectedPrefixedSubredditNames=");
        return p1.h.c(t, Arrays.toString(this.i), ')');
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        parcel.writeStringArray(this.f);
        parcel.writeStringArray(this.g);
        parcel.writeStringArray(this.h);
        parcel.writeStringArray(this.i);
    }
    
    public static final class a implements Parcelable$Creator<c>
    {
        public final Object createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            return new c(parcel.createStringArray(), parcel.createStringArray(), parcel.createStringArray(), parcel.createStringArray());
        }
        
        public final Object[] newArray(final int n) {
            return new c[n];
        }
    }
}
