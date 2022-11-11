// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.internal.VineCardUtils;
import com.twitter.sdk.android.core.models.Card;
import hj.a;
import java.io.Serializable;

public class ScribeItem implements Serializable
{
    public static final int TYPE_MESSAGE = 6;
    public static final int TYPE_TWEET = 0;
    public static final int TYPE_USER = 3;
    @a("card_event")
    public final CardEvent cardEvent;
    @a("description")
    public final String description;
    @a("id")
    public final Long id;
    @a("item_type")
    public final Integer itemType;
    @a("media_details")
    public final MediaDetails mediaDetails;
    
    private ScribeItem(final Integer itemType, final Long id, final String description, final CardEvent cardEvent, final MediaDetails mediaDetails) {
        this.itemType = itemType;
        this.id = id;
        this.description = description;
        this.cardEvent = cardEvent;
        this.mediaDetails = mediaDetails;
    }
    
    public static MediaDetails createCardDetails(final long n, final Card card) {
        return new MediaDetails(n, 4, Long.valueOf(VineCardUtils.getPublisherId(card)));
    }
    
    public static MediaDetails createMediaDetails(final long n, final MediaEntity mediaEntity) {
        return new MediaDetails(n, getMediaType(mediaEntity), mediaEntity.id);
    }
    
    public static ScribeItem fromMediaEntity(final long id, final MediaEntity mediaEntity) {
        return new Builder().setItemType(0).setId(id).setMediaDetails(createMediaDetails(id, mediaEntity)).build();
    }
    
    public static ScribeItem fromMessage(final String description) {
        return new Builder().setItemType(6).setDescription(description).build();
    }
    
    public static ScribeItem fromTweet(final Tweet tweet) {
        return new Builder().setItemType(0).setId(tweet.id).build();
    }
    
    public static ScribeItem fromTweetCard(final long id, final Card card) {
        return new Builder().setItemType(0).setId(id).setMediaDetails(createCardDetails(id, card)).build();
    }
    
    public static ScribeItem fromUser(final User user) {
        return new Builder().setItemType(3).setId(user.id).build();
    }
    
    public static int getMediaType(final MediaEntity mediaEntity) {
        if ("animated_gif".equals(mediaEntity.type)) {
            return 3;
        }
        return 1;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ScribeItem scribeItem = (ScribeItem)o;
            final Integer itemType = this.itemType;
            Label_0064: {
                if (itemType != null) {
                    if (itemType.equals(scribeItem.itemType)) {
                        break Label_0064;
                    }
                }
                else if (scribeItem.itemType == null) {
                    break Label_0064;
                }
                return false;
            }
            final Long id = this.id;
            Label_0096: {
                if (id != null) {
                    if (id.equals(scribeItem.id)) {
                        break Label_0096;
                    }
                }
                else if (scribeItem.id == null) {
                    break Label_0096;
                }
                return false;
            }
            final String description = this.description;
            Label_0128: {
                if (description != null) {
                    if (description.equals(scribeItem.description)) {
                        break Label_0128;
                    }
                }
                else if (scribeItem.description == null) {
                    break Label_0128;
                }
                return false;
            }
            final CardEvent cardEvent = this.cardEvent;
            Label_0160: {
                if (cardEvent != null) {
                    if (cardEvent.equals(scribeItem.cardEvent)) {
                        break Label_0160;
                    }
                }
                else if (scribeItem.cardEvent == null) {
                    break Label_0160;
                }
                return false;
            }
            final MediaDetails mediaDetails = this.mediaDetails;
            final MediaDetails mediaDetails2 = scribeItem.mediaDetails;
            if (mediaDetails != null) {
                if (mediaDetails.equals(mediaDetails2)) {
                    return b;
                }
            }
            else if (mediaDetails2 == null) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer itemType = this.itemType;
        int hashCode = 0;
        int hashCode2;
        if (itemType != null) {
            hashCode2 = itemType.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Long id = this.id;
        int hashCode3;
        if (id != null) {
            hashCode3 = id.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String description = this.description;
        int hashCode4;
        if (description != null) {
            hashCode4 = description.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final CardEvent cardEvent = this.cardEvent;
        int hashCode5;
        if (cardEvent != null) {
            hashCode5 = cardEvent.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final MediaDetails mediaDetails = this.mediaDetails;
        if (mediaDetails != null) {
            hashCode = mediaDetails.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    public static class Builder
    {
        private CardEvent cardEvent;
        private String description;
        private Long id;
        private Integer itemType;
        private MediaDetails mediaDetails;
        
        public ScribeItem build() {
            return new ScribeItem(this.itemType, this.id, this.description, this.cardEvent, this.mediaDetails, null);
        }
        
        public Builder setCardEvent(final CardEvent cardEvent) {
            this.cardEvent = cardEvent;
            return this;
        }
        
        public Builder setDescription(final String description) {
            this.description = description;
            return this;
        }
        
        public Builder setId(final long n) {
            this.id = n;
            return this;
        }
        
        public Builder setItemType(final int n) {
            this.itemType = n;
            return this;
        }
        
        public Builder setMediaDetails(final MediaDetails mediaDetails) {
            this.mediaDetails = mediaDetails;
            return this;
        }
    }
    
    public static class CardEvent implements Serializable
    {
        @a("promotion_card_type")
        public final int promotionCardType;
        
        public CardEvent(final int promotionCardType) {
            this.promotionCardType = promotionCardType;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                if (this.promotionCardType != ((CardEvent)o).promotionCardType) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return this.promotionCardType;
        }
    }
    
    public static class MediaDetails implements Serializable
    {
        public static final String GIF_TYPE = "animated_gif";
        public static final int TYPE_AMPLIFY = 2;
        public static final int TYPE_ANIMATED_GIF = 3;
        public static final int TYPE_CONSUMER = 1;
        public static final int TYPE_VINE = 4;
        @a("content_id")
        public final long contentId;
        @a("media_type")
        public final int mediaType;
        @a("publisher_id")
        public final long publisherId;
        
        public MediaDetails(final long contentId, final int mediaType, final long publisherId) {
            this.contentId = contentId;
            this.mediaType = mediaType;
            this.publisherId = publisherId;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final MediaDetails mediaDetails = (MediaDetails)o;
            if (this.contentId != mediaDetails.contentId) {
                return false;
            }
            if (this.mediaType != mediaDetails.mediaType) {
                return false;
            }
            if (this.publisherId != mediaDetails.publisherId) {
                b = false;
            }
            return b;
        }
        
        @Override
        public int hashCode() {
            final long contentId = this.contentId;
            final int n = (int)(contentId ^ contentId >>> 32);
            final int mediaType = this.mediaType;
            final long publisherId = this.publisherId;
            return (n * 31 + mediaType) * 31 + (int)(publisherId >>> 32 ^ publisherId);
        }
    }
}
