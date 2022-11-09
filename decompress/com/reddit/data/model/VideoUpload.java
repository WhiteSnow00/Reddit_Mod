// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ak0.m;
import ak0.n;
import android.text.TextUtils;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.io.Serializable;
import com.raizlabs.android.dbflow.structure.BaseModel;

public class VideoUpload extends BaseModel implements Serializable, Comparable<VideoUpload>, Parcelable
{
    public static final Parcelable$Creator<VideoUpload> CREATOR;
    public int attempts;
    public String bodyText;
    public String discussionType;
    public int duration;
    public String filePath;
    public String flairId;
    public String flairText;
    public boolean gif;
    public int id;
    public boolean isNsfw;
    public boolean isReactAllowed;
    public boolean isSpoiler;
    public int originalDuration;
    public String parentPostId;
    public String posterUrl;
    public String requestId;
    public String source;
    public int status;
    public String subreddit;
    public String thumbnail;
    public long timestamp;
    public String title;
    public long uploadDuration;
    public String uploadError;
    public String uploadUrl;
    public int videoHeight;
    public String videoKey;
    public int videoWidth;
    
    static {
        CREATOR = (Parcelable$Creator)new VideoUpload$1();
    }
    
    public VideoUpload() {
    }
    
    public VideoUpload(final Parcel parcel) {
        this.id = parcel.readInt();
        this.requestId = parcel.readString();
        this.filePath = parcel.readString();
        this.title = parcel.readString();
        this.subreddit = parcel.readString();
        this.uploadUrl = parcel.readString();
        this.posterUrl = parcel.readString();
        this.thumbnail = parcel.readString();
        this.videoKey = parcel.readString();
        this.timestamp = parcel.readLong();
        this.status = parcel.readInt();
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        this.gif = (byte1 != 0);
        this.attempts = parcel.readInt();
        this.originalDuration = parcel.readInt();
        this.duration = parcel.readInt();
        this.source = parcel.readString();
        this.uploadDuration = parcel.readLong();
        this.uploadError = parcel.readString();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.flairText = parcel.readString();
        this.flairId = parcel.readString();
        this.discussionType = parcel.readString();
        this.isNsfw = (parcel.readByte() != 0);
        this.isSpoiler = (parcel.readByte() != 0);
        this.parentPostId = parcel.readString();
        this.isReactAllowed = (parcel.readByte() != 0 && b);
        this.bodyText = parcel.readString();
    }
    
    public int compareTo(final VideoUpload videoUpload) {
        final long timestamp = this.timestamp;
        final long timestamp2 = videoUpload.timestamp;
        int n;
        if (timestamp > timestamp2) {
            n = -1;
        }
        else if (timestamp == timestamp2) {
            n = 0;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final VideoUpload videoUpload = (VideoUpload)o;
            if (this.id == videoUpload.id && this.timestamp == videoUpload.timestamp && this.status == videoUpload.status && this.gif == videoUpload.gif && this.attempts == videoUpload.attempts) {
                final String requestId = this.requestId;
                if (requestId != null) {
                    if (!requestId.equals(videoUpload.requestId)) {
                        return false;
                    }
                }
                else if (videoUpload.requestId != null) {
                    return false;
                }
                final String filePath = this.filePath;
                if (filePath != null) {
                    if (!filePath.equals(videoUpload.filePath)) {
                        return false;
                    }
                }
                else if (videoUpload.filePath != null) {
                    return false;
                }
                final String title = this.title;
                if (title != null) {
                    if (!title.equals(videoUpload.title)) {
                        return false;
                    }
                }
                else if (videoUpload.title != null) {
                    return false;
                }
                final String subreddit = this.subreddit;
                if (subreddit != null) {
                    if (!subreddit.equals(videoUpload.subreddit)) {
                        return false;
                    }
                }
                else if (videoUpload.subreddit != null) {
                    return false;
                }
                final String uploadUrl = this.uploadUrl;
                if (uploadUrl != null) {
                    if (!uploadUrl.equals(videoUpload.uploadUrl)) {
                        return false;
                    }
                }
                else if (videoUpload.uploadUrl != null) {
                    return false;
                }
                final String posterUrl = this.posterUrl;
                if (posterUrl != null) {
                    if (!posterUrl.equals(videoUpload.posterUrl)) {
                        return false;
                    }
                }
                else if (videoUpload.posterUrl != null) {
                    return false;
                }
                final String thumbnail = this.thumbnail;
                if (thumbnail != null) {
                    if (!thumbnail.equals(videoUpload.thumbnail)) {
                        return false;
                    }
                }
                else if (videoUpload.thumbnail != null) {
                    return false;
                }
                final String videoKey = this.videoKey;
                if (videoKey != null) {
                    if (!videoKey.equals(videoUpload.videoKey)) {
                        return false;
                    }
                }
                else if (videoUpload.videoKey != null) {
                    return false;
                }
                final String bodyText = this.bodyText;
                if (bodyText != null) {
                    if (bodyText.equals(videoUpload.bodyText)) {
                        return b;
                    }
                }
                else if (videoUpload.bodyText == null) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public int getAttempts() {
        return this.attempts;
    }
    
    public String getBodyText() {
        return this.bodyText;
    }
    
    public String getDiscussionType() {
        return this.discussionType;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public String getFilePath() {
        return this.filePath;
    }
    
    public String getFlairId() {
        return this.flairId;
    }
    
    public String getFlairText() {
        return this.flairText;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getOriginalDuration() {
        return this.originalDuration;
    }
    
    public String getParentPostId() {
        return this.parentPostId;
    }
    
    public String getPosterUrl() {
        return this.posterUrl;
    }
    
    public String getRequestId() {
        return this.requestId;
    }
    
    public String getSource() {
        return this.source;
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public String getSubreddit() {
        return this.subreddit;
    }
    
    public String getThumbnail() {
        return this.thumbnail;
    }
    
    public long getTimestamp() {
        return this.timestamp;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public long getUploadDuration() {
        return this.uploadDuration;
    }
    
    public String getUploadError() {
        return this.uploadError;
    }
    
    public String getUploadUrl() {
        return this.uploadUrl;
    }
    
    public int getVideoHeight() {
        return this.videoHeight;
    }
    
    public String getVideoKey() {
        return this.videoKey;
    }
    
    public int getVideoWidth() {
        return this.videoWidth;
    }
    
    public boolean hasPostData() {
        return !TextUtils.isEmpty((CharSequence)this.title) && !TextUtils.isEmpty((CharSequence)this.subreddit) && !TextUtils.isEmpty((CharSequence)this.filePath);
    }
    
    public int hashCode() {
        final int id = this.id;
        final String requestId = this.requestId;
        int hashCode = 0;
        int hashCode2;
        if (requestId != null) {
            hashCode2 = requestId.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String filePath = this.filePath;
        int hashCode3;
        if (filePath != null) {
            hashCode3 = filePath.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String title = this.title;
        int hashCode4;
        if (title != null) {
            hashCode4 = title.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String subreddit = this.subreddit;
        int hashCode5;
        if (subreddit != null) {
            hashCode5 = subreddit.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final String uploadUrl = this.uploadUrl;
        int hashCode6;
        if (uploadUrl != null) {
            hashCode6 = uploadUrl.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final String posterUrl = this.posterUrl;
        int hashCode7;
        if (posterUrl != null) {
            hashCode7 = posterUrl.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final String thumbnail = this.thumbnail;
        int hashCode8;
        if (thumbnail != null) {
            hashCode8 = thumbnail.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final String videoKey = this.videoKey;
        int hashCode9;
        if (videoKey != null) {
            hashCode9 = videoKey.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final long timestamp = this.timestamp;
        final int n = (int)(timestamp ^ timestamp >>> 32);
        final int status = this.status;
        final int gif = this.gif ? 1 : 0;
        final int attempts = this.attempts;
        final String bodyText = this.bodyText;
        if (bodyText != null) {
            hashCode = bodyText.hashCode();
        }
        return ((((((((((((id * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + n) * 31 + status) * 31 + gif) * 31 + attempts) * 31 + hashCode;
    }
    
    public boolean isGif() {
        return this.gif;
    }
    
    public boolean isNsfw() {
        return this.isNsfw;
    }
    
    public boolean isReactAllowed() {
        return this.isReactAllowed;
    }
    
    public boolean isSpoiler() {
        return this.isSpoiler;
    }
    
    public void setAttempts(final int attempts) {
        this.attempts = attempts;
    }
    
    public void setBodyText(final String bodyText) {
        this.bodyText = bodyText;
    }
    
    public void setDiscussionType(final String discussionType) {
        this.discussionType = discussionType;
    }
    
    public void setDuration(final int duration) {
        this.duration = duration;
    }
    
    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }
    
    public void setFlairId(final String flairId) {
        this.flairId = flairId;
    }
    
    public void setFlairText(final String flairText) {
        this.flairText = flairText;
    }
    
    public void setGif(final boolean gif) {
        this.gif = gif;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public void setNsfw(final boolean isNsfw) {
        this.isNsfw = isNsfw;
    }
    
    public void setOriginalDuration(final int originalDuration) {
        this.originalDuration = originalDuration;
    }
    
    public void setParentPostId(final String parentPostId) {
        this.parentPostId = parentPostId;
    }
    
    public void setPosterUrl(final String posterUrl) {
        this.posterUrl = posterUrl;
    }
    
    public void setReactAllowed(final boolean isReactAllowed) {
        this.isReactAllowed = isReactAllowed;
    }
    
    public void setRequestId(final String requestId) {
        this.requestId = requestId;
    }
    
    public void setSource(final String source) {
        this.source = source;
    }
    
    public void setSpoiler(final boolean isSpoiler) {
        this.isSpoiler = isSpoiler;
    }
    
    public void setStatus(final int status) {
        this.status = status;
    }
    
    public void setSubreddit(final String subreddit) {
        this.subreddit = subreddit;
    }
    
    public void setThumbnail(final String thumbnail) {
        this.thumbnail = thumbnail;
    }
    
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    public void setUploadDuration(final long uploadDuration) {
        this.uploadDuration = uploadDuration;
    }
    
    public void setUploadError(final String uploadError) {
        this.uploadError = uploadError;
    }
    
    public void setUploadUrl(final String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }
    
    public void setVideoHeight(final int videoHeight) {
        this.videoHeight = videoHeight;
    }
    
    public void setVideoKey(final String videoKey) {
        this.videoKey = videoKey;
    }
    
    public void setVideoWidth(final int videoWidth) {
        this.videoWidth = videoWidth;
    }
    
    public String toString() {
        final StringBuilder k = a.k("VideoUpload{id=");
        k.append(this.id);
        k.append(", requestId='");
        n.w(k, this.requestId, '\'', ", filePath='");
        n.w(k, this.filePath, '\'', ", title='");
        n.w(k, this.title, '\'', ", subreddit='");
        n.w(k, this.subreddit, '\'', ", uploadUrl='");
        n.w(k, this.uploadUrl, '\'', ", posterUrl='");
        n.w(k, this.posterUrl, '\'', ", thumbnail='");
        n.w(k, this.thumbnail, '\'', ", videoKey='");
        n.w(k, this.videoKey, '\'', ", timestamp=");
        k.append(this.timestamp);
        k.append(", status=");
        k.append(this.status);
        k.append(", gif=");
        k.append(this.gif);
        k.append(", attempts=");
        k.append(this.attempts);
        k.append(", bodyText='");
        return m.m(k, this.bodyText, '\'', '}');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.id);
        parcel.writeString(this.requestId);
        parcel.writeString(this.filePath);
        parcel.writeString(this.title);
        parcel.writeString(this.subreddit);
        parcel.writeString(this.uploadUrl);
        parcel.writeString(this.posterUrl);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.videoKey);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.status);
        parcel.writeByte((byte)(byte)(this.gif ? 1 : 0));
        parcel.writeInt(this.attempts);
        parcel.writeInt(this.originalDuration);
        parcel.writeInt(this.duration);
        parcel.writeString(this.source);
        parcel.writeLong(this.uploadDuration);
        parcel.writeString(this.uploadError);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.flairText);
        parcel.writeString(this.flairId);
        parcel.writeString(this.discussionType);
        parcel.writeByte((byte)(byte)(this.isNsfw ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.isSpoiler ? 1 : 0));
        parcel.writeString(this.parentPostId);
        parcel.writeByte((byte)(byte)(this.isReactAllowed ? 1 : 0));
        parcel.writeString(this.bodyText);
    }
}
