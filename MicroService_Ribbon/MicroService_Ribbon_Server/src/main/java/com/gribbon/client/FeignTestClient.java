package com.gribbon.client;

import com.gribbon.service.FeignServices;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author chendom
 * @date 2017/11/30 10:36
 */
@FeignClient(name = "FeignTestClient",fallbackFactory = FeignTestClient.TestClientFallbackFactory.class)
public interface FeignTestClient extends FeignServices {
    @Component
    class TestClientFallbackFactory implements FallbackFactory<FeignTestClient> {


        @Override
        public FeignTestClient create(Throwable throwable) {
            return new FeignTestClient() {
                @Override
                public String getConfig() {
                    return "暂时无法使用此接口";
                }
            };
        }
    }
}
