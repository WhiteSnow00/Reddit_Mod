// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.util.Log;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable
{
    public static final Parcelable$Creator<RatingCompat> CREATOR;
    public final int f;
    public final float g;
    public Object h;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<RatingCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            }
            
            public final Object[] newArray(final int n) {
                return new RatingCompat[n];
            }
        };
    }
    
    public RatingCompat(final int f, final float g) {
        this.f = f;
        this.g = g;
    }
    
    public static RatingCompat a(final Object h) {
        RatingCompat ratingCompat = null;
        final RatingCompat ratingCompat2 = null;
        if (h != null) {
            final Rating rating = (Rating)h;
            final int b = RatingCompat.b.b(rating);
            if (RatingCompat.b.e(rating)) {
                float n = 1.0f;
                switch (b) {
                    default: {
                        return null;
                    }
                    case 6: {
                        final float a = RatingCompat.b.a(rating);
                        if (a >= 0.0f && a <= 100.0f) {
                            ratingCompat = new RatingCompat(6, a);
                            break;
                        }
                        Log.e("Rating", "Invalid percentage-based rating value");
                        ratingCompat = ratingCompat2;
                        break;
                    }
                    case 3:
                    case 4:
                    case 5: {
                        final float c = RatingCompat.b.c(rating);
                        float n2;
                        if (b != 3) {
                            if (b != 4) {
                                if (b != 5) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Invalid rating style (");
                                    sb.append(b);
                                    sb.append(") for a star rating");
                                    Log.e("Rating", sb.toString());
                                    ratingCompat = ratingCompat2;
                                    break;
                                }
                                n2 = 5.0f;
                            }
                            else {
                                n2 = 4.0f;
                            }
                        }
                        else {
                            n2 = 3.0f;
                        }
                        if (c >= 0.0f && c <= n2) {
                            ratingCompat = new RatingCompat(b, c);
                            break;
                        }
                        Log.e("Rating", "Trying to set out of range star-based rating");
                        ratingCompat = ratingCompat2;
                        break;
                    }
                    case 2: {
                        if (!RatingCompat.b.f(rating)) {
                            n = 0.0f;
                        }
                        ratingCompat = new RatingCompat(2, n);
                        break;
                    }
                    case 1: {
                        if (!RatingCompat.b.d(rating)) {
                            n = 0.0f;
                        }
                        ratingCompat = new RatingCompat(1, n);
                        break;
                    }
                }
            }
            else {
                switch (b) {
                    default: {
                        ratingCompat = ratingCompat2;
                        break;
                    }
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        ratingCompat = new RatingCompat(b, -1.0f);
                        break;
                    }
                }
            }
            ratingCompat.h = h;
        }
        return ratingCompat;
    }
    
    public final int describeContents() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Rating:style=");
        t.append(this.f);
        t.append(" rating=");
        final float g = this.g;
        String value;
        if (g < 0.0f) {
            value = "unrated";
        }
        else {
            value = String.valueOf(g);
        }
        t.append(value);
        return t.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.f);
        parcel.writeFloat(this.g);
    }
    
    public static final class b
    {
        public static float a(final Rating rating) {
            return rating.getPercentRating();
        }
        
        public static int b(final Rating rating) {
            return rating.getRatingStyle();
        }
        
        public static float c(final Rating rating) {
            return rating.getStarRating();
        }
        
        public static boolean d(final Rating rating) {
            return rating.hasHeart();
        }
        
        public static boolean e(final Rating rating) {
            return rating.isRated();
        }
        
        public static boolean f(final Rating rating) {
            return rating.isThumbUp();
        }
        
        public static Rating g(final boolean b) {
            return Rating.newHeartRating(b);
        }
        
        public static Rating h(final float n) {
            return Rating.newPercentageRating(n);
        }
        
        public static Rating i(final int n, final float n2) {
            return Rating.newStarRating(n, n2);
        }
        
        public static Rating j(final boolean b) {
            return Rating.newThumbRating(b);
        }
        
        public static Rating k(final int n) {
            return Rating.newUnratedRating(n);
        }
    }
}
