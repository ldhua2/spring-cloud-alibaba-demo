spring-cloud-alibaba-demo

## 各微服务占用端口情况
| 模块 |	微服务工程名	| 端口	| 功能描述 
| --- | --- | --- | --- 
| sca01-nacos-regdis | nacos-registry-provider | 9030 | Nacos提供方
| | nacos-discovery-consumer	| 9031	| Nacos 消费方
| sca02-nacos-config | nacos-dynamic-port | 9032 | Nacos动态配置端口
| | nacos-dynamic-env | 9033 | Nacos动态环境变量
| sca03-openfeign | openfeign-provider | 9040/9041/9042 | Openfeign 提供方
| | ribbon-consumer	| 9043	| Ribbon 消费方
| | openfeign-consumer	|9044 | Openfeign 消费方
