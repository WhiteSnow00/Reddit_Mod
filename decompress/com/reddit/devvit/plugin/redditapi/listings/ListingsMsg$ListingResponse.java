// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.devvit.plugin.redditapi.listings;

import com.google.protobuf.GeneratedMessageLite$b;
import com.google.protobuf.c1;
import com.google.protobuf.GeneratedMessageLite$c;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.nio.ByteBuffer;
import com.google.protobuf.l;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ByteString;
import com.google.protobuf.d0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.google.protobuf.a;
import com.reddit.devvit.plugin.redditapi.common.CommonMsg$Listing;
import com.google.protobuf.Internal$j;
import com.google.protobuf.n1;
import com.google.protobuf.d1;
import com.google.protobuf.GeneratedMessageLite;

public final class ListingsMsg$ListingResponse extends GeneratedMessageLite<ListingsMsg$ListingResponse, a> implements d1
{
    private static final ListingsMsg$ListingResponse DEFAULT_INSTANCE;
    public static final int LISTINGS_FIELD_NUMBER = 1;
    private static volatile n1<ListingsMsg$ListingResponse> PARSER;
    private Internal$j<CommonMsg$Listing> listings_;
    
    static {
        GeneratedMessageLite.registerDefaultInstance((Class)ListingsMsg$ListingResponse.class, (GeneratedMessageLite)(DEFAULT_INSTANCE = new ListingsMsg$ListingResponse()));
    }
    
    private ListingsMsg$ListingResponse() {
        this.listings_ = (Internal$j<CommonMsg$Listing>)GeneratedMessageLite.emptyProtobufList();
    }
    
    public static ListingsMsg$ListingResponse access$21200() {
        return ListingsMsg$ListingResponse.DEFAULT_INSTANCE;
    }
    
    public static void access$21300(final ListingsMsg$ListingResponse listingsMsg$ListingResponse, final int n, final CommonMsg$Listing commonMsg$Listing) {
        listingsMsg$ListingResponse.setListings(n, commonMsg$Listing);
    }
    
    public static void access$21400(final ListingsMsg$ListingResponse listingsMsg$ListingResponse, final CommonMsg$Listing commonMsg$Listing) {
        listingsMsg$ListingResponse.addListings(commonMsg$Listing);
    }
    
    public static void access$21500(final ListingsMsg$ListingResponse listingsMsg$ListingResponse, final int n, final CommonMsg$Listing commonMsg$Listing) {
        listingsMsg$ListingResponse.addListings(n, commonMsg$Listing);
    }
    
    public static void access$21600(final ListingsMsg$ListingResponse listingsMsg$ListingResponse, final Iterable iterable) {
        listingsMsg$ListingResponse.addAllListings(iterable);
    }
    
    public static void access$21700(final ListingsMsg$ListingResponse listingsMsg$ListingResponse) {
        listingsMsg$ListingResponse.clearListings();
    }
    
    public static void access$21800(final ListingsMsg$ListingResponse listingsMsg$ListingResponse, final int n) {
        listingsMsg$ListingResponse.removeListings(n);
    }
    
    private void addAllListings(final Iterable<? extends CommonMsg$Listing> iterable) {
        this.ensureListingsIsMutable();
        com.google.protobuf.a.addAll((Iterable)iterable, (List)this.listings_);
    }
    
    private void addListings(final int n, final CommonMsg$Listing commonMsg$Listing) {
        commonMsg$Listing.getClass();
        this.ensureListingsIsMutable();
        ((List<CommonMsg$Listing>)this.listings_).add(n, commonMsg$Listing);
    }
    
    private void addListings(final CommonMsg$Listing commonMsg$Listing) {
        commonMsg$Listing.getClass();
        this.ensureListingsIsMutable();
        ((List<CommonMsg$Listing>)this.listings_).add(commonMsg$Listing);
    }
    
    private void clearListings() {
        this.listings_ = (Internal$j<CommonMsg$Listing>)GeneratedMessageLite.emptyProtobufList();
    }
    
    private void ensureListingsIsMutable() {
        final Internal$j<CommonMsg$Listing> listings_ = this.listings_;
        if (!listings_.E0()) {
            this.listings_ = (Internal$j<CommonMsg$Listing>)GeneratedMessageLite.mutableCopy((Internal$j)listings_);
        }
    }
    
    public static ListingsMsg$ListingResponse getDefaultInstance() {
        return ListingsMsg$ListingResponse.DEFAULT_INSTANCE;
    }
    
    public static a newBuilder() {
        return (a)ListingsMsg$ListingResponse.DEFAULT_INSTANCE.createBuilder();
    }
    
    public static a newBuilder(final ListingsMsg$ListingResponse listingsMsg$ListingResponse) {
        return (a)ListingsMsg$ListingResponse.DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listingsMsg$ListingResponse);
    }
    
    public static ListingsMsg$ListingResponse parseDelimitedFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$ListingResponse parseDelimitedFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseDelimitedFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final ByteString byteString) throws InvalidProtocolBufferException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, byteString);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final ByteString byteString, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, byteString, d0);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final l l) throws IOException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, l);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final l l, final d0 d0) throws IOException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, l, d0);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final InputStream inputStream) throws IOException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, inputStream);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final InputStream inputStream, final d0 d0) throws IOException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, inputStream, d0);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, byteBuffer);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final ByteBuffer byteBuffer, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, byteBuffer, d0);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final byte[] array) throws InvalidProtocolBufferException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, array);
    }
    
    public static ListingsMsg$ListingResponse parseFrom(final byte[] array, final d0 d0) throws InvalidProtocolBufferException {
        return (ListingsMsg$ListingResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, array, d0);
    }
    
    public static n1<ListingsMsg$ListingResponse> parser() {
        return (n1<ListingsMsg$ListingResponse>)ListingsMsg$ListingResponse.DEFAULT_INSTANCE.getParserForType();
    }
    
    private void removeListings(final int n) {
        this.ensureListingsIsMutable();
        this.listings_.remove(n);
    }
    
    private void setListings(final int n, final CommonMsg$Listing commonMsg$Listing) {
        commonMsg$Listing.getClass();
        this.ensureListingsIsMutable();
        ((List<CommonMsg$Listing>)this.listings_).set(n, commonMsg$Listing);
    }
    
    public final Object dynamicMethod(final GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, final Object o, final Object o2) {
        switch (c90.a.a[((Enum)generatedMessageLite$MethodToInvoke).ordinal()]) {
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
                final n1<ListingsMsg$ListingResponse> parser;
                if ((parser = ListingsMsg$ListingResponse.PARSER) == null) {
                    synchronized (ListingsMsg$ListingResponse.class) {
                        if (ListingsMsg$ListingResponse.PARSER == null) {
                            ListingsMsg$ListingResponse.PARSER = (n1<ListingsMsg$ListingResponse>)new GeneratedMessageLite$c((GeneratedMessageLite)ListingsMsg$ListingResponse.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 4: {
                return ListingsMsg$ListingResponse.DEFAULT_INSTANCE;
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo((c1)ListingsMsg$ListingResponse.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "listings_", CommonMsg$Listing.class });
            }
            case 2: {
                return new a();
            }
            case 1: {
                return new ListingsMsg$ListingResponse();
            }
        }
    }
    
    public CommonMsg$Listing getListings(final int n) {
        return ((List<CommonMsg$Listing>)this.listings_).get(n);
    }
    
    public int getListingsCount() {
        return ((List)this.listings_).size();
    }
    
    public List<CommonMsg$Listing> getListingsList() {
        return (List<CommonMsg$Listing>)this.listings_;
    }
    
    public com.reddit.devvit.plugin.redditapi.common.a getListingsOrBuilder(final int n) {
        return ((List<com.reddit.devvit.plugin.redditapi.common.a>)this.listings_).get(n);
    }
    
    public List<? extends com.reddit.devvit.plugin.redditapi.common.a> getListingsOrBuilderList() {
        return (List<? extends com.reddit.devvit.plugin.redditapi.common.a>)this.listings_;
    }
    
    public static final class a extends GeneratedMessageLite$b<ListingsMsg$ListingResponse, a> implements d1
    {
        public a() {
            super((GeneratedMessageLite)ListingsMsg$ListingResponse.access$21200());
        }
    }
}
