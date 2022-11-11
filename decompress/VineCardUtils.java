// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.models.UserValue;
import com.twitter.sdk.android.core.models.ImageValue;
import com.twitter.sdk.android.core.models.Card;

public class VineCardUtils
{
    public static final String PLAYER_CARD = "player";
    public static final String VINE_CARD = "vine";
    public static final long VINE_USER_ID = 586671909L;
    
    private VineCardUtils() {
    }
    
    public static ImageValue getImageValue(final Card card) {
        return (ImageValue)card.bindingValues.get("player_image");
    }
    
    public static String getPublisherId(final Card card) {
        return ((UserValue)card.bindingValues.get("site")).idStr;
    }
    
    public static String getStreamUrl(final Card card) {
        return (String)card.bindingValues.get("player_stream_url");
    }
    
    public static boolean isVine(final Card card) {
        return ("player".equals(card.name) || "vine".equals(card.name)) && isVineUser(card);
    }
    
    private static boolean isVineUser(final Card card) {
        final UserValue userValue = (UserValue)card.bindingValues.get("site");
        if (userValue == null) {
            return false;
        }
        try {
            if (Long.parseLong(userValue.idStr) == 586671909L) {
                return true;
            }
            return false;
        }
        catch (final NumberFormatException ex) {
            return false;
        }
    }
}
