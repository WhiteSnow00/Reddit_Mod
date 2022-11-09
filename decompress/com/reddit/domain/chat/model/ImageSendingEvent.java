// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ak0.m;
import ah2.f;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/chat/model/ImageSendingEvent;", "", "()V", "ImagesProcessed", "ImagesRejected", "MessagesFailed", "MessagesSent", "ProgressUpdated", "Lcom/reddit/domain/chat/model/ImageSendingEvent$ImagesProcessed;", "Lcom/reddit/domain/chat/model/ImageSendingEvent$ImagesRejected;", "Lcom/reddit/domain/chat/model/ImageSendingEvent$MessagesFailed;", "Lcom/reddit/domain/chat/model/ImageSendingEvent$MessagesSent;", "Lcom/reddit/domain/chat/model/ImageSendingEvent$ProgressUpdated;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ImageSendingEvent
{
    private ImageSendingEvent() {
    }
    
    @Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/chat/model/ImageSendingEvent$ImagesProcessed;", "Lcom/reddit/domain/chat/model/ImageSendingEvent;", "accepted", "", "Lcom/reddit/domain/chat/model/ImageValidationData;", "(Ljava/util/List;)V", "getAccepted", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class ImagesProcessed extends ImageSendingEvent
    {
        private final List<ImageValidationData> accepted;
        
        public ImagesProcessed(final List<ImageValidationData> accepted) {
            f.f((Object)accepted, "accepted");
            super(null);
            this.accepted = accepted;
        }
        
        public final List<ImageValidationData> component1() {
            return this.accepted;
        }
        
        public final ImagesProcessed copy(final List<ImageValidationData> list) {
            f.f((Object)list, "accepted");
            return new ImagesProcessed(list);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof ImagesProcessed && f.a((Object)this.accepted, (Object)((ImagesProcessed)o).accepted));
        }
        
        public final List<ImageValidationData> getAccepted() {
            return this.accepted;
        }
        
        @Override
        public int hashCode() {
            return this.accepted.hashCode();
        }
        
        @Override
        public String toString() {
            return m.n(a.k("ImagesProcessed(accepted="), (List)this.accepted, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/chat/model/ImageSendingEvent$ImagesRejected;", "Lcom/reddit/domain/chat/model/ImageSendingEvent;", "rejected", "", "Lcom/reddit/domain/chat/model/ImageValidationData;", "(Ljava/util/List;)V", "getRejected", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class ImagesRejected extends ImageSendingEvent
    {
        private final List<ImageValidationData> rejected;
        
        public ImagesRejected(final List<ImageValidationData> rejected) {
            f.f((Object)rejected, "rejected");
            super(null);
            this.rejected = rejected;
        }
        
        public final List<ImageValidationData> component1() {
            return this.rejected;
        }
        
        public final ImagesRejected copy(final List<ImageValidationData> list) {
            f.f((Object)list, "rejected");
            return new ImagesRejected(list);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof ImagesRejected && f.a((Object)this.rejected, (Object)((ImagesRejected)o).rejected));
        }
        
        public final List<ImageValidationData> getRejected() {
            return this.rejected;
        }
        
        @Override
        public int hashCode() {
            return this.rejected.hashCode();
        }
        
        @Override
        public String toString() {
            return m.n(a.k("ImagesRejected(rejected="), (List)this.rejected, ')');
        }
    }
    
    @Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/chat/model/ImageSendingEvent$MessagesFailed;", "Lcom/reddit/domain/chat/model/ImageSendingEvent;", "exceptions", "", "", "messageIdOfFailedImageUploads", "", "(Ljava/util/List;Ljava/util/List;)V", "getExceptions", "()Ljava/util/List;", "getMessageIdOfFailedImageUploads", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class MessagesFailed extends ImageSendingEvent
    {
        private final List<Throwable> exceptions;
        private final List<Long> messageIdOfFailedImageUploads;
        
        public MessagesFailed(final List<? extends Throwable> exceptions, final List<Long> messageIdOfFailedImageUploads) {
            f.f((Object)exceptions, "exceptions");
            f.f((Object)messageIdOfFailedImageUploads, "messageIdOfFailedImageUploads");
            super(null);
            this.exceptions = (List<Throwable>)exceptions;
            this.messageIdOfFailedImageUploads = messageIdOfFailedImageUploads;
        }
        
        public final List<Throwable> component1() {
            return this.exceptions;
        }
        
        public final List<Long> component2() {
            return this.messageIdOfFailedImageUploads;
        }
        
        public final MessagesFailed copy(final List<? extends Throwable> list, final List<Long> list2) {
            f.f((Object)list, "exceptions");
            f.f((Object)list2, "messageIdOfFailedImageUploads");
            return new MessagesFailed(list, list2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof MessagesFailed)) {
                return false;
            }
            final MessagesFailed messagesFailed = (MessagesFailed)o;
            return f.a((Object)this.exceptions, (Object)messagesFailed.exceptions) && f.a((Object)this.messageIdOfFailedImageUploads, (Object)messagesFailed.messageIdOfFailedImageUploads);
        }
        
        public final List<Throwable> getExceptions() {
            return this.exceptions;
        }
        
        public final List<Long> getMessageIdOfFailedImageUploads() {
            return this.messageIdOfFailedImageUploads;
        }
        
        @Override
        public int hashCode() {
            return this.messageIdOfFailedImageUploads.hashCode() + this.exceptions.hashCode() * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("MessagesFailed(exceptions=");
            k.append(this.exceptions);
            k.append(", messageIdOfFailedImageUploads=");
            return m.n(k, (List)this.messageIdOfFailedImageUploads, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/chat/model/ImageSendingEvent$MessagesSent;", "Lcom/reddit/domain/chat/model/ImageSendingEvent;", "imageCount", "", "(I)V", "getImageCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class MessagesSent extends ImageSendingEvent
    {
        private final int imageCount;
        
        public MessagesSent(final int imageCount) {
            super(null);
            this.imageCount = imageCount;
        }
        
        public final int component1() {
            return this.imageCount;
        }
        
        public final MessagesSent copy(final int n) {
            return new MessagesSent(n);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof MessagesSent && this.imageCount == ((MessagesSent)o).imageCount);
        }
        
        public final int getImageCount() {
            return this.imageCount;
        }
        
        @Override
        public int hashCode() {
            return Integer.hashCode(this.imageCount);
        }
        
        @Override
        public String toString() {
            return d.k(a.k("MessagesSent(imageCount="), this.imageCount, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/ImageSendingEvent$ProgressUpdated;", "Lcom/reddit/domain/chat/model/ImageSendingEvent;", "messageId", "", "progress", "", "(JI)V", "getMessageId", "()J", "getProgress", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class ProgressUpdated extends ImageSendingEvent
    {
        private final long messageId;
        private final int progress;
        
        public ProgressUpdated(final long messageId, final int progress) {
            super(null);
            this.messageId = messageId;
            this.progress = progress;
        }
        
        public final long component1() {
            return this.messageId;
        }
        
        public final int component2() {
            return this.progress;
        }
        
        public final ProgressUpdated copy(final long n, final int n2) {
            return new ProgressUpdated(n, n2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ProgressUpdated)) {
                return false;
            }
            final ProgressUpdated progressUpdated = (ProgressUpdated)o;
            return this.messageId == progressUpdated.messageId && this.progress == progressUpdated.progress;
        }
        
        public final long getMessageId() {
            return this.messageId;
        }
        
        public final int getProgress() {
            return this.progress;
        }
        
        @Override
        public int hashCode() {
            return Integer.hashCode(this.progress) + Long.hashCode(this.messageId) * 31;
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("ProgressUpdated(messageId=");
            k.append(this.messageId);
            k.append(", progress=");
            return d.k(k, this.progress, ')');
        }
    }
}
