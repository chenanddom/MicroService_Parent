package com.gfeignclient.client;

import com.gfeignclient.service.FeignClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "InfoClient", fallbackFactory = InformationClient.InformationClientFactory.class)
public interface InformationClient extends FeignClientService {
    @Component
    class InformationClientFactory implements FallbackFactory<InformationClient> {
        @Override
        public InformationClient create(Throwable throwable) {
            return new InformationClient() {
                @Override
                public String getAllInformation() {
                    return "暂时无法使用此接口";
                }
            };
        }
    }
}
