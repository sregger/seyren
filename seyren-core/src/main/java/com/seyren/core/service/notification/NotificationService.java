package com.seyren.core.service.notification;

import com.seyren.core.domain.Alert;
import com.seyren.core.domain.Check;
import com.seyren.core.domain.Subscription;
import com.seyren.core.exception.NotificationFailedException;

public interface NotificationService {
	
    void sendNotification(Check check, Subscription subscription, Alert alert) throws NotificationFailedException;
    
}
