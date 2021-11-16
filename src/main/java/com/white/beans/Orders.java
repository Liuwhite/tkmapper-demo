package com.white.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private String orderId;
    private String receiverName;
    private String receiveMobile;
    private String receiverAddress;
}
