// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.models.User;
import android.text.TextUtils;

public final class UserUtils
{
    private UserUtils() {
    }
    
    public static CharSequence formatScreenName(final CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (charSequence.charAt(0) == '@') {
            return charSequence;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("@");
        sb.append((Object)charSequence);
        return sb.toString();
    }
    
    public static String getProfileImageUrlHttps(final User user, final AvatarSize avatarSize) {
        if (user != null) {
            final String profileImageUrlHttps = user.profileImageUrlHttps;
            if (profileImageUrlHttps != null) {
                String replace = profileImageUrlHttps;
                if (avatarSize != null) {
                    if (profileImageUrlHttps == null) {
                        replace = profileImageUrlHttps;
                    }
                    else {
                        final int n = UserUtils$1.$SwitchMap$com$twitter$sdk$android$core$internal$UserUtils$AvatarSize[avatarSize.ordinal()];
                        if (n != 1 && n != 2 && n != 3 && n != 4 && n != 5) {
                            return profileImageUrlHttps;
                        }
                        replace = profileImageUrlHttps.replace(AvatarSize.NORMAL.getSuffix(), avatarSize.getSuffix());
                    }
                }
                return replace;
            }
        }
        return null;
    }
    
    public enum AvatarSize
    {
        BIGGER("_bigger"), 
        MINI("_mini"), 
        NORMAL("_normal"), 
        ORIGINAL("_original"), 
        REASONABLY_SMALL("_reasonably_small");
        
        private final String suffix;
        
        private AvatarSize(final String suffix) {
            this.suffix = suffix;
        }
        
        public String getSuffix() {
            return this.suffix;
        }
    }
}
