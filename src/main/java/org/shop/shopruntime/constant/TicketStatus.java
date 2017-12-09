package org.shop.shopruntime.constant;

public enum  TicketStatus {
    ORDERED(1), PAID(2);
    private Integer ticketStatus;

    public Integer getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    TicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
