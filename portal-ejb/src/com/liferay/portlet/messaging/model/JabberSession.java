/**
 * Copyright (c) 2000-2006 Liferay, LLC. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.messaging.model;

import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.XMPPConnection;

import com.liferay.portlet.chat.model.RosterUpdateListener;


/**
 * <a href="JabberSession.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Ming-Gih Lam
 *
 */
public class JabberSession {

	private XMPPConnection _connection;

	private MessageListener _messageListener;

	private PacketCollector _collector;

	private RosterUpdateListener _rosterListener;

	private Roster _roster;

	private MessageWait _messageWait;

	public PacketCollector getCollector() {
		return _collector;
	}

	public void setCollector(PacketCollector collector) {
		this._collector = collector;
	}

	public XMPPConnection getConnection() {
		return _connection;
	}

	public void setConnection(XMPPConnection connection) {
		this._connection = connection;
	}

	public MessageListener getMessageListener() {
		return _messageListener;
	}

	public void setMessageListener(MessageListener messageListener) {
		this._messageListener = messageListener;
	}

	public Roster getRoster() {
		return _roster;
	}

	public void setRoster(Roster roster) {
		this._roster = roster;
	}

	public RosterUpdateListener getRosterListener() {
		return _rosterListener;
	}

	public void setRosterListener(RosterUpdateListener rosterListener) {
		this._rosterListener = rosterListener;
	}

	public MessageWait getMessageWait() {
		return _messageWait;
	}

	public void setMessageWait(MessageWait messageWait) {
		this._messageWait = messageWait;
	}

}