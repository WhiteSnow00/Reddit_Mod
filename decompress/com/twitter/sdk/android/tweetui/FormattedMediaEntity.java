// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.UrlEntity;
import com.twitter.sdk.android.core.models.MediaEntity;

class FormattedMediaEntity extends FormattedUrlEntity
{
    public final String mediaUrlHttps;
    public final String type;
    
    public FormattedMediaEntity(final MediaEntity mediaEntity) {
        super(((UrlEntity)mediaEntity).getStart(), ((UrlEntity)mediaEntity).getEnd(), ((UrlEntity)mediaEntity).displayUrl, ((UrlEntity)mediaEntity).url, ((UrlEntity)mediaEntity).expandedUrl);
        this.type = mediaEntity.type;
        this.mediaUrlHttps = mediaEntity.mediaUrlHttps;
    }
}
