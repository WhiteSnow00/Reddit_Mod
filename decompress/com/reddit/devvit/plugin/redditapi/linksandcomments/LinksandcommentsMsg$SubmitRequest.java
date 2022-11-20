// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.linksandcomments;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.a;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class LinksandcommentsMsg$SubmitRequest extends GeneratedMessageLite<LinksandcommentsMsg$SubmitRequest, a> implements d1
{
    public static final int AD_FIELD_NUMBER = 1;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final LinksandcommentsMsg$SubmitRequest DEFAULT_INSTANCE;
    public static final int EVENT_END_FIELD_NUMBER = 3;
    public static final int EVENT_START_FIELD_NUMBER = 4;
    public static final int EVENT_TZ_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int FLAIR_ID_FIELD_NUMBER = 7;
    public static final int FLAIR_TEXT_FIELD_NUMBER = 8;
    public static final int KIND_FIELD_NUMBER = 9;
    public static final int NSFW_FIELD_NUMBER = 10;
    private static volatile n1<LinksandcommentsMsg$SubmitRequest> PARSER;
    public static final int RESUBMIT_FIELD_NUMBER = 11;
    public static final int RICHTEXT_JSON_FIELD_NUMBER = 12;
    public static final int SENDREPLIES_FIELD_NUMBER = 13;
    public static final int SPOILER_FIELD_NUMBER = 14;
    public static final int SR_FIELD_NUMBER = 15;
    public static final int TEXT_FIELD_NUMBER = 16;
    public static final int TITLE_FIELD_NUMBER = 17;
    public static final int URL_FIELD_NUMBER = 18;
    public static final int VIDEO_POSTER_URL_FIELD_NUMBER = 19;
    private boolean ad_;
    private String collectionId_;
    private String eventEnd_;
    private String eventStart_;
    private String eventTz_;
    private String extension_;
    private String flairId_;
    private String flairText_;
    private String kind_;
    private boolean nsfw_;
    private boolean resubmit_;
    private String richtextJson_;
    private boolean sendreplies_;
    private boolean spoiler_;
    private String sr_;
    private String text_;
    private String title_;
    private String url_;
    private String videoPosterUrl_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)LinksandcommentsMsg$SubmitRequest.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new LinksandcommentsMsg$SubmitRequest()));
    }
    
    private LinksandcommentsMsg$SubmitRequest() {
        this.collectionId_ = "";
        this.eventEnd_ = "";
        this.eventStart_ = "";
        this.eventTz_ = "";
        this.extension_ = "";
        this.flairId_ = "";
        this.flairText_ = "";
        this.kind_ = "";
        this.richtextJson_ = "";
        this.sr_ = "";
        this.text_ = "";
        this.title_ = "";
        this.url_ = "";
        this.videoPosterUrl_ = "";
    }
    
    public static LinksandcommentsMsg$SubmitRequest access$16100() {
        return LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE;
    }
    
    public static void access$16200(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final boolean ad) {
        linksandcommentsMsg$SubmitRequest.setAd(ad);
    }
    
    public static void access$16300(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearAd();
    }
    
    public static void access$16400(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String collectionId) {
        linksandcommentsMsg$SubmitRequest.setCollectionId(collectionId);
    }
    
    public static void access$16500(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearCollectionId();
    }
    
    public static void access$16600(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString collectionIdBytes) {
        linksandcommentsMsg$SubmitRequest.setCollectionIdBytes(collectionIdBytes);
    }
    
    public static void access$16700(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String eventEnd) {
        linksandcommentsMsg$SubmitRequest.setEventEnd(eventEnd);
    }
    
    public static void access$16800(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearEventEnd();
    }
    
    public static void access$16900(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString eventEndBytes) {
        linksandcommentsMsg$SubmitRequest.setEventEndBytes(eventEndBytes);
    }
    
    public static void access$17000(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String eventStart) {
        linksandcommentsMsg$SubmitRequest.setEventStart(eventStart);
    }
    
    public static void access$17100(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearEventStart();
    }
    
    public static void access$17200(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString eventStartBytes) {
        linksandcommentsMsg$SubmitRequest.setEventStartBytes(eventStartBytes);
    }
    
    public static void access$17300(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String eventTz) {
        linksandcommentsMsg$SubmitRequest.setEventTz(eventTz);
    }
    
    public static void access$17400(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearEventTz();
    }
    
    public static void access$17500(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString eventTzBytes) {
        linksandcommentsMsg$SubmitRequest.setEventTzBytes(eventTzBytes);
    }
    
    public static void access$17600(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String extension) {
        linksandcommentsMsg$SubmitRequest.setExtension(extension);
    }
    
    public static void access$17700(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearExtension();
    }
    
    public static void access$17800(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString extensionBytes) {
        linksandcommentsMsg$SubmitRequest.setExtensionBytes(extensionBytes);
    }
    
    public static void access$17900(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String flairId) {
        linksandcommentsMsg$SubmitRequest.setFlairId(flairId);
    }
    
    public static void access$18000(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearFlairId();
    }
    
    public static void access$18100(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString flairIdBytes) {
        linksandcommentsMsg$SubmitRequest.setFlairIdBytes(flairIdBytes);
    }
    
    public static void access$18200(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String flairText) {
        linksandcommentsMsg$SubmitRequest.setFlairText(flairText);
    }
    
    public static void access$18300(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearFlairText();
    }
    
    public static void access$18400(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString flairTextBytes) {
        linksandcommentsMsg$SubmitRequest.setFlairTextBytes(flairTextBytes);
    }
    
    public static void access$18500(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String kind) {
        linksandcommentsMsg$SubmitRequest.setKind(kind);
    }
    
    public static void access$18600(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearKind();
    }
    
    public static void access$18700(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString kindBytes) {
        linksandcommentsMsg$SubmitRequest.setKindBytes(kindBytes);
    }
    
    public static void access$18800(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final boolean nsfw) {
        linksandcommentsMsg$SubmitRequest.setNsfw(nsfw);
    }
    
    public static void access$18900(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearNsfw();
    }
    
    public static void access$19000(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final boolean resubmit) {
        linksandcommentsMsg$SubmitRequest.setResubmit(resubmit);
    }
    
    public static void access$19100(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearResubmit();
    }
    
    public static void access$19200(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String richtextJson) {
        linksandcommentsMsg$SubmitRequest.setRichtextJson(richtextJson);
    }
    
    public static void access$19300(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearRichtextJson();
    }
    
    public static void access$19400(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString richtextJsonBytes) {
        linksandcommentsMsg$SubmitRequest.setRichtextJsonBytes(richtextJsonBytes);
    }
    
    public static void access$19500(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final boolean sendreplies) {
        linksandcommentsMsg$SubmitRequest.setSendreplies(sendreplies);
    }
    
    public static void access$19600(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearSendreplies();
    }
    
    public static void access$19700(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final boolean spoiler) {
        linksandcommentsMsg$SubmitRequest.setSpoiler(spoiler);
    }
    
    public static void access$19800(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearSpoiler();
    }
    
    public static void access$19900(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String sr) {
        linksandcommentsMsg$SubmitRequest.setSr(sr);
    }
    
    public static void access$20000(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearSr();
    }
    
    public static void access$20100(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString srBytes) {
        linksandcommentsMsg$SubmitRequest.setSrBytes(srBytes);
    }
    
    public static void access$20200(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String text) {
        linksandcommentsMsg$SubmitRequest.setText(text);
    }
    
    public static void access$20300(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearText();
    }
    
    public static void access$20400(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString textBytes) {
        linksandcommentsMsg$SubmitRequest.setTextBytes(textBytes);
    }
    
    public static void access$20500(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String title) {
        linksandcommentsMsg$SubmitRequest.setTitle(title);
    }
    
    public static void access$20600(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearTitle();
    }
    
    public static void access$20700(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString titleBytes) {
        linksandcommentsMsg$SubmitRequest.setTitleBytes(titleBytes);
    }
    
    public static void access$20800(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String url) {
        linksandcommentsMsg$SubmitRequest.setUrl(url);
    }
    
    public static void access$20900(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearUrl();
    }
    
    public static void access$21000(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString urlBytes) {
        linksandcommentsMsg$SubmitRequest.setUrlBytes(urlBytes);
    }
    
    public static void access$21100(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final String videoPosterUrl) {
        linksandcommentsMsg$SubmitRequest.setVideoPosterUrl(videoPosterUrl);
    }
    
    public static void access$21200(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        linksandcommentsMsg$SubmitRequest.clearVideoPosterUrl();
    }
    
    public static void access$21300(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest, final ByteString videoPosterUrlBytes) {
        linksandcommentsMsg$SubmitRequest.setVideoPosterUrlBytes(videoPosterUrlBytes);
    }
    
    private void clearAd() {
        this.ad_ = false;
    }
    
    private void clearCollectionId() {
        this.collectionId_ = getDefaultInstance().getCollectionId();
    }
    
    private void clearEventEnd() {
        this.eventEnd_ = getDefaultInstance().getEventEnd();
    }
    
    private void clearEventStart() {
        this.eventStart_ = getDefaultInstance().getEventStart();
    }
    
    private void clearEventTz() {
        this.eventTz_ = getDefaultInstance().getEventTz();
    }
    
    private void clearExtension() {
        this.extension_ = getDefaultInstance().getExtension();
    }
    
    private void clearFlairId() {
        this.flairId_ = getDefaultInstance().getFlairId();
    }
    
    private void clearFlairText() {
        this.flairText_ = getDefaultInstance().getFlairText();
    }
    
    private void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }
    
    private void clearNsfw() {
        this.nsfw_ = false;
    }
    
    private void clearResubmit() {
        this.resubmit_ = false;
    }
    
    private void clearRichtextJson() {
        this.richtextJson_ = getDefaultInstance().getRichtextJson();
    }
    
    private void clearSendreplies() {
        this.sendreplies_ = false;
    }
    
    private void clearSpoiler() {
        this.spoiler_ = false;
    }
    
    private void clearSr() {
        this.sr_ = getDefaultInstance().getSr();
    }
    
    private void clearText() {
        this.text_ = getDefaultInstance().getText();
    }
    
    private void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }
    
    private void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }
    
    private void clearVideoPosterUrl() {
        this.videoPosterUrl_ = getDefaultInstance().getVideoPosterUrl();
    }
    
    public static LinksandcommentsMsg$SubmitRequest getDefaultInstance() {
        return LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final LinksandcommentsMsg$SubmitRequest linksandcommentsMsg$SubmitRequest) {
        return (a)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linksandcommentsMsg$SubmitRequest);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, byteString);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final l l) throws IOException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, l);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final l l, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, l, d0);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final InputStream inputStream) throws IOException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, inputStream);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, array);
    }
    
    public static LinksandcommentsMsg$SubmitRequest parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (LinksandcommentsMsg$SubmitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<LinksandcommentsMsg$SubmitRequest> parser() {
        return (n1<LinksandcommentsMsg$SubmitRequest>)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void setAd(final boolean ad_) {
        this.ad_ = ad_;
    }
    
    private void setCollectionId(final String collectionId_) {
        collectionId_.getClass();
        this.collectionId_ = collectionId_;
    }
    
    private void setCollectionIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.collectionId_ = byteString.toStringUtf8();
    }
    
    private void setEventEnd(final String eventEnd_) {
        eventEnd_.getClass();
        this.eventEnd_ = eventEnd_;
    }
    
    private void setEventEndBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.eventEnd_ = byteString.toStringUtf8();
    }
    
    private void setEventStart(final String eventStart_) {
        eventStart_.getClass();
        this.eventStart_ = eventStart_;
    }
    
    private void setEventStartBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.eventStart_ = byteString.toStringUtf8();
    }
    
    private void setEventTz(final String eventTz_) {
        eventTz_.getClass();
        this.eventTz_ = eventTz_;
    }
    
    private void setEventTzBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.eventTz_ = byteString.toStringUtf8();
    }
    
    private void setExtension(final String extension_) {
        extension_.getClass();
        this.extension_ = extension_;
    }
    
    private void setExtensionBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.extension_ = byteString.toStringUtf8();
    }
    
    private void setFlairId(final String flairId_) {
        flairId_.getClass();
        this.flairId_ = flairId_;
    }
    
    private void setFlairIdBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairId_ = byteString.toStringUtf8();
    }
    
    private void setFlairText(final String flairText_) {
        flairText_.getClass();
        this.flairText_ = flairText_;
    }
    
    private void setFlairTextBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.flairText_ = byteString.toStringUtf8();
    }
    
    private void setKind(final String kind_) {
        kind_.getClass();
        this.kind_ = kind_;
    }
    
    private void setKindBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.toStringUtf8();
    }
    
    private void setNsfw(final boolean nsfw_) {
        this.nsfw_ = nsfw_;
    }
    
    private void setResubmit(final boolean resubmit_) {
        this.resubmit_ = resubmit_;
    }
    
    private void setRichtextJson(final String richtextJson_) {
        richtextJson_.getClass();
        this.richtextJson_ = richtextJson_;
    }
    
    private void setRichtextJsonBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.richtextJson_ = byteString.toStringUtf8();
    }
    
    private void setSendreplies(final boolean sendreplies_) {
        this.sendreplies_ = sendreplies_;
    }
    
    private void setSpoiler(final boolean spoiler_) {
        this.spoiler_ = spoiler_;
    }
    
    private void setSr(final String sr_) {
        sr_.getClass();
        this.sr_ = sr_;
    }
    
    private void setSrBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.sr_ = byteString.toStringUtf8();
    }
    
    private void setText(final String text_) {
        text_.getClass();
        this.text_ = text_;
    }
    
    private void setTextBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }
    
    private void setTitle(final String title_) {
        title_.getClass();
        this.title_ = title_;
    }
    
    private void setTitleBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }
    
    private void setUrl(final String url_) {
        url_.getClass();
        this.url_ = url_;
    }
    
    private void setUrlBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }
    
    private void setVideoPosterUrl(final String videoPosterUrl_) {
        videoPosterUrl_.getClass();
        this.videoPosterUrl_ = videoPosterUrl_;
    }
    
    private void setVideoPosterUrlBytes(final ByteString byteString) {
        com.google.protobuf.a.checkByteStringIsUtf8(byteString);
        this.videoPosterUrl_ = byteString.toStringUtf8();
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (b90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return 1;
            }
            case 5: {
                final n1<LinksandcommentsMsg$SubmitRequest> parser;
                if ((parser = LinksandcommentsMsg$SubmitRequest.PARSER) == null) {
                    synchronized (LinksandcommentsMsg$SubmitRequest.class) {
                        if (LinksandcommentsMsg$SubmitRequest.PARSER == null) {
                            LinksandcommentsMsg$SubmitRequest.PARSER = (n1<LinksandcommentsMsg$SubmitRequest>)new GeneratedMessageLite$c((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)LinksandcommentsMsg$SubmitRequest.DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0007\u000b\u0007\f\u0208\r\u0007\u000e\u0007\u000f\u0208\u0010\u0208\u0011\u0208\u0012\u0208\u0013\u0208", new Object[] { "ad_", "collectionId_", "eventEnd_", "eventStart_", "eventTz_", "extension_", "flairId_", "flairText_", "kind_", "nsfw_", "resubmit_", "richtextJson_", "sendreplies_", "spoiler_", "sr_", "text_", "title_", "url_", "videoPosterUrl_" });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new LinksandcommentsMsg$SubmitRequest();
            }
        }
    }
    
    public boolean getAd() {
        return this.ad_;
    }
    
    public String getCollectionId() {
        return this.collectionId_;
    }
    
    public ByteString getCollectionIdBytes() {
        return ByteString.copyFromUtf8(this.collectionId_);
    }
    
    public String getEventEnd() {
        return this.eventEnd_;
    }
    
    public ByteString getEventEndBytes() {
        return ByteString.copyFromUtf8(this.eventEnd_);
    }
    
    public String getEventStart() {
        return this.eventStart_;
    }
    
    public ByteString getEventStartBytes() {
        return ByteString.copyFromUtf8(this.eventStart_);
    }
    
    public String getEventTz() {
        return this.eventTz_;
    }
    
    public ByteString getEventTzBytes() {
        return ByteString.copyFromUtf8(this.eventTz_);
    }
    
    public String getExtension() {
        return this.extension_;
    }
    
    public ByteString getExtensionBytes() {
        return ByteString.copyFromUtf8(this.extension_);
    }
    
    public String getFlairId() {
        return this.flairId_;
    }
    
    public ByteString getFlairIdBytes() {
        return ByteString.copyFromUtf8(this.flairId_);
    }
    
    public String getFlairText() {
        return this.flairText_;
    }
    
    public ByteString getFlairTextBytes() {
        return ByteString.copyFromUtf8(this.flairText_);
    }
    
    public String getKind() {
        return this.kind_;
    }
    
    public ByteString getKindBytes() {
        return ByteString.copyFromUtf8(this.kind_);
    }
    
    public boolean getNsfw() {
        return this.nsfw_;
    }
    
    public boolean getResubmit() {
        return this.resubmit_;
    }
    
    public String getRichtextJson() {
        return this.richtextJson_;
    }
    
    public ByteString getRichtextJsonBytes() {
        return ByteString.copyFromUtf8(this.richtextJson_);
    }
    
    public boolean getSendreplies() {
        return this.sendreplies_;
    }
    
    public boolean getSpoiler() {
        return this.spoiler_;
    }
    
    public String getSr() {
        return this.sr_;
    }
    
    public ByteString getSrBytes() {
        return ByteString.copyFromUtf8(this.sr_);
    }
    
    public String getText() {
        return this.text_;
    }
    
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }
    
    public String getTitle() {
        return this.title_;
    }
    
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }
    
    public String getUrl() {
        return this.url_;
    }
    
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }
    
    public String getVideoPosterUrl() {
        return this.videoPosterUrl_;
    }
    
    public ByteString getVideoPosterUrlBytes() {
        return ByteString.copyFromUtf8(this.videoPosterUrl_);
    }
    
    public static final class a extends GeneratedMessageLite$b<LinksandcommentsMsg$SubmitRequest, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)LinksandcommentsMsg$SubmitRequest.access$16100());
        }
    }
}
