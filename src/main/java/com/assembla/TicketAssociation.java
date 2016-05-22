package com.assembla;

import com.assembla.enums.TicketRelationship;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ticket_association")
public class TicketAssociation {

	public String createdAt;
	public Integer id;
	public TicketRelationship relationship;
	public Integer ticket1Id;
	public Integer ticket2Id;

	public String getCreatedAt() {
		return createdAt;
	}

	public Integer getId() {
		return id;
	}

	public TicketRelationship getRelationship() {
		return relationship;
	}

	public Integer getTicket1Id() {
		return ticket1Id;
	}

	public Integer getTicket2Id() {
		return ticket2Id;
	}

	public TicketAssociation setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public TicketAssociation setId(Integer id) {
		this.id = id;
		return this;
	}

	public TicketAssociation setRelationship(TicketRelationship relationship) {
		this.relationship = relationship;
		return this;
	}

	public TicketAssociation setTicket1Id(Integer ticket1Id) {
		this.ticket1Id = ticket1Id;
		return this;
	}

	public TicketAssociation setTicket2Id(Integer ticket2Id) {
		this.ticket2Id = ticket2Id;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TicketAssociation [");
		if (createdAt != null) {
			builder.append("createdAt=");
			builder.append(createdAt);
			builder.append(", ");
		}
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (relationship != null) {
			builder.append("relationship=");
			builder.append(relationship);
			builder.append(", ");
		}
		if (ticket1Id != null) {
			builder.append("ticket1Id=");
			builder.append(ticket1Id);
			builder.append(", ");
		}
		if (ticket2Id != null) {
			builder.append("ticket2Id=");
			builder.append(ticket2Id);
		}
		builder.append("]");
		return builder.toString();
	}

}
