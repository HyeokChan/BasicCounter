# 베이스 이미지 지정
FROM openjdk:17

# 애플리케이션 파일 복사
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENV SPRING_PROFILES_ACTIVE=prod

# 포트 열기
EXPOSE 8081

# 애플리케이션 실행
ENTRYPOINT ["java","-jar","/app.jar"]