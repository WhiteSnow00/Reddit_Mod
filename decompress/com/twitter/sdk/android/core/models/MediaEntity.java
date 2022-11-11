// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import hj.a;

public class MediaEntity extends UrlEntity
{
    @a("ext_alt_text")
    public final String altText;
    @a("id")
    public final long id;
    @a("id_str")
    public final String idStr;
    @a("media_url")
    public final String mediaUrl;
    @a("media_url_https")
    public final String mediaUrlHttps;
    @a("sizes")
    public final MediaEntity.MediaEntity$Sizes sizes;
    @a("source_status_id")
    public final long sourceStatusId;
    @a("source_status_id_str")
    public final String sourceStatusIdStr;
    @a("type")
    public final String type;
    @a("video_info")
    public final VideoInfo videoInfo;
    
    public MediaEntity(final String s, final String s2, final String s3, final int n, final int n2, final long id, final String idStr, final String mediaUrl, final String mediaUrlHttps, final MediaEntity.MediaEntity$Sizes sizes, final long sourceStatusId, final String sourceStatusIdStr, final String type, final VideoInfo videoInfo, final String altText) {
        super(s, s2, s3, n, n2);
        this.id = id;
        this.idStr = idStr;
        this.mediaUrl = mediaUrl;
        this.mediaUrlHttps = mediaUrlHttps;
        this.sizes = sizes;
        this.sourceStatusId = sourceStatusId;
        this.sourceStatusIdStr = sourceStatusIdStr;
        this.type = type;
        this.videoInfo = videoInfo;
        this.altText = altText;
    }
}
