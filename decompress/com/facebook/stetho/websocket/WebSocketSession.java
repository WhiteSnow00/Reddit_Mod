// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

class WebSocketSession implements SimpleSession
{
    private final SimpleEndpoint mEndpoint;
    private final WriteCallback mErrorForwardingWriteCallback;
    private AtomicBoolean mIsOpen;
    private final ReadCallback mReadCallback;
    private final ReadHandler mReadHandler;
    private volatile boolean mSentClose;
    private final WriteHandler mWriteHandler;
    
    public WebSocketSession(final InputStream inputStream, final OutputStream outputStream, final SimpleEndpoint mEndpoint) {
        this.mIsOpen = new AtomicBoolean(false);
        this.mReadCallback = (ReadCallback)new ReadCallback(this) {
            public final WebSocketSession this$0;
            
            private void handleBinaryFrame(final byte[] array, final int n) {
                WebSocketSession.access$400(this.this$0).onMessage((SimpleSession)this.this$0, array, n);
            }
            
            private void handleClose(final byte[] array, int n) {
                String s;
                if (n >= 2) {
                    final int n2 = (array[0] & 0xFF) << 8 | (array[1] & 0xFF);
                    if (n > 2) {
                        s = new String(array, 2, n - 2);
                        n = n2;
                    }
                    else {
                        s = null;
                        n = n2;
                    }
                }
                else {
                    n = 1006;
                    s = "Unparseable close frame";
                }
                if (!WebSocketSession.access$100(this.this$0)) {
                    WebSocketSession.access$200(this.this$0, 1000, "Received close frame");
                }
                this.this$0.markAndSignalClosed(n, s);
            }
            
            private void handlePing(final byte[] array, final int n) {
                WebSocketSession.access$300(this.this$0, FrameHelper.createPongFrame(array, n));
            }
            
            private void handlePong(final byte[] array, final int n) {
            }
            
            private void handleTextFrame(final byte[] array, final int n) {
                WebSocketSession.access$400(this.this$0).onMessage((SimpleSession)this.this$0, new String(array, 0, n));
            }
            
            public void onCompleteFrame(final byte b, final byte[] array, final int n) {
                if (b != 1) {
                    if (b != 2) {
                        switch (b) {
                            default: {
                                WebSocketSession.access$000(this.this$0, new IOException(d.h("Unsupported frame opcode=", (int)b)));
                                break;
                            }
                            case 10: {
                                this.handlePong(array, n);
                                break;
                            }
                            case 9: {
                                this.handlePing(array, n);
                                break;
                            }
                            case 8: {
                                this.handleClose(array, n);
                                break;
                            }
                        }
                    }
                    else {
                        this.handleBinaryFrame(array, n);
                    }
                }
                else {
                    this.handleTextFrame(array, n);
                }
            }
        };
        this.mErrorForwardingWriteCallback = (WriteCallback)new WriteCallback(this) {
            public final WebSocketSession this$0;
            
            public void onFailure(final IOException ex) {
                WebSocketSession.access$000(this.this$0, ex);
            }
            
            public void onSuccess() {
            }
        };
        this.mReadHandler = new ReadHandler(inputStream, mEndpoint);
        this.mWriteHandler = new WriteHandler(outputStream);
        this.mEndpoint = mEndpoint;
    }
    
    public static void access$000(final WebSocketSession webSocketSession, final IOException ex) {
        webSocketSession.signalError(ex);
    }
    
    public static boolean access$100(final WebSocketSession webSocketSession) {
        return webSocketSession.mSentClose;
    }
    
    public static void access$200(final WebSocketSession webSocketSession, final int n, final String s) {
        webSocketSession.sendClose(n, s);
    }
    
    public static void access$300(final WebSocketSession webSocketSession, final Frame frame) {
        webSocketSession.doWrite(frame);
    }
    
    public static SimpleEndpoint access$400(final WebSocketSession webSocketSession) {
        return webSocketSession.mEndpoint;
    }
    
    private void doWrite(final Frame frame) {
        if (this.signalErrorIfNotOpen()) {
            return;
        }
        this.mWriteHandler.write(frame, this.mErrorForwardingWriteCallback);
    }
    
    private void sendClose(final int n, final String s) {
        this.doWrite(FrameHelper.createCloseFrame(n, s));
        this.markSentClose();
    }
    
    private void signalError(final IOException ex) {
        this.mEndpoint.onError((SimpleSession)this, (Throwable)ex);
    }
    
    private boolean signalErrorIfNotOpen() {
        if (!this.isOpen()) {
            this.signalError(new IOException("Session is closed"));
            return true;
        }
        return false;
    }
    
    public void close(final int n, final String s) {
        this.sendClose(n, s);
        this.markAndSignalClosed(n, s);
    }
    
    public void handle() throws IOException {
        this.markAndSignalOpen();
        try {
            this.mReadHandler.readLoop(this.mReadCallback);
        }
        catch (final IOException ex) {
            this.markAndSignalClosed(1006, null);
            throw ex;
        }
        catch (final EOFException ex2) {
            this.markAndSignalClosed(1011, "EOF while reading");
        }
    }
    
    public boolean isOpen() {
        return this.mIsOpen.get();
    }
    
    public void markAndSignalClosed(final int n, final String s) {
        if (this.mIsOpen.getAndSet(false)) {
            this.mEndpoint.onClose((SimpleSession)this, n, s);
        }
    }
    
    public void markAndSignalOpen() {
        if (!this.mIsOpen.getAndSet(true)) {
            this.mEndpoint.onOpen((SimpleSession)this);
        }
    }
    
    public void markSentClose() {
        this.mSentClose = true;
    }
    
    public void sendBinary(final byte[] array) {
        this.doWrite(FrameHelper.createBinaryFrame(array));
    }
    
    public void sendText(final String s) {
        this.doWrite(FrameHelper.createTextFrame(s));
    }
}
