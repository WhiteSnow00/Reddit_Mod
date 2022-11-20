// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import java.util.Iterator;
import com.twitter.sdk.android.core.models.VideoInfo$Variant;
import com.twitter.sdk.android.core.models.TweetEntities;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.sdk.android.core.models.MediaEntity;
import java.util.List;
import com.twitter.sdk.android.core.models.Tweet;

public final class TweetMediaUtils
{
    private static final String CONTENT_TYPE_HLS = "application/x-mpegURL";
    private static final String CONTENT_TYPE_MP4 = "video/mp4";
    public static final String GIF_TYPE = "animated_gif";
    private static final int LOOP_VIDEO_IN_MILLIS = 6500;
    public static final String PHOTO_TYPE = "photo";
    public static final String VIDEO_TYPE = "video";
    
    private TweetMediaUtils() {
    }
    
    public static List<MediaEntity> getAllMediaEntities(final Tweet tweet) {
        final ArrayList list = new ArrayList();
        final TweetEntities entities = tweet.entities;
        if (entities != null) {
            final List media = entities.media;
            if (media != null) {
                list.addAll(media);
            }
        }
        final TweetEntities extendedEntities = tweet.extendedEntities;
        if (extendedEntities != null) {
            final List media2 = extendedEntities.media;
            if (media2 != null) {
                list.addAll(media2);
            }
        }
        return list;
    }
    
    public static List<MediaEntity> getPhotoEntities(final Tweet tweet) {
        final ArrayList list = new ArrayList();
        final TweetEntities extendedEntities = tweet.extendedEntities;
        if (extendedEntities != null) {
            final List media = extendedEntities.media;
            if (media != null && media.size() > 0) {
                for (int i = 0; i <= extendedEntities.media.size() - 1; ++i) {
                    final MediaEntity mediaEntity = extendedEntities.media.get(i);
                    if (mediaEntity.type != null && isPhotoType(mediaEntity)) {
                        list.add(mediaEntity);
                    }
                }
            }
        }
        return list;
    }
    
    public static MediaEntity getPhotoEntity(final Tweet tweet) {
        final List<MediaEntity> allMediaEntities = getAllMediaEntities(tweet);
        for (int i = allMediaEntities.size() - 1; i >= 0; --i) {
            final MediaEntity mediaEntity = allMediaEntities.get(i);
            if (mediaEntity.type != null && isPhotoType(mediaEntity)) {
                return mediaEntity;
            }
        }
        return null;
    }
    
    public static VideoInfo$Variant getSupportedVariant(final MediaEntity mediaEntity) {
        for (final VideoInfo$Variant videoInfo$Variant : mediaEntity.videoInfo.variants) {
            if (isVariantSupported(videoInfo$Variant)) {
                return videoInfo$Variant;
            }
        }
        return null;
    }
    
    public static MediaEntity getVideoEntity(final Tweet tweet) {
        for (final MediaEntity mediaEntity : getAllMediaEntities(tweet)) {
            if (mediaEntity.type != null && isVideoType(mediaEntity)) {
                return mediaEntity;
            }
        }
        return null;
    }
    
    public static boolean hasPhoto(final Tweet tweet) {
        return getPhotoEntity(tweet) != null;
    }
    
    public static boolean hasSupportedVideo(final Tweet tweet) {
        final MediaEntity videoEntity = getVideoEntity(tweet);
        return videoEntity != null && getSupportedVariant(videoEntity) != null;
    }
    
    public static boolean isLooping(final MediaEntity mediaEntity) {
        return "animated_gif".equals(mediaEntity.type) || ("video".endsWith(mediaEntity.type) && mediaEntity.videoInfo.durationMillis < 6500L);
    }
    
    public static boolean isPhotoType(final MediaEntity mediaEntity) {
        return "photo".equals(mediaEntity.type);
    }
    
    public static boolean isVariantSupported(final VideoInfo$Variant videoInfo$Variant) {
        return "application/x-mpegURL".equals(videoInfo$Variant.contentType) || "video/mp4".equals(videoInfo$Variant.contentType);
    }
    
    public static boolean isVideoType(final MediaEntity mediaEntity) {
        return "video".equals(mediaEntity.type) || "animated_gif".equals(mediaEntity.type);
    }
    
    public static boolean showVideoControls(final MediaEntity mediaEntity) {
        return "animated_gif".equals(mediaEntity.type) ^ true;
    }
}
