package com.victortavares.anotaai.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AwsSnsService {

    @Autowired
    private AmazonSNS snsClient;

    @Autowired
    @Qualifier("catalogEventsTopic")
    private Topic catalogoTopico;

    public void publishCatalogo(String mensagem) {
        this.snsClient.publish(catalogoTopico.getTopicArn(), mensagem);
    }


}
