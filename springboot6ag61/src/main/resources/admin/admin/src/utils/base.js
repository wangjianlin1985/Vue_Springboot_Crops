const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot6ag61/",
            name: "springboot6ag61",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot6ag61/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "农作物数据共享平台"
        } 
    }
}
export default base
